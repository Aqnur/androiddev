package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class PostActivity extends AppCompatActivity {

    ImageView like_image;

    private int images[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        getIncomingIntent();
        ConfigureBackButton();

        like_image = findViewById(R.id.like_image);
        like_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Liked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getIncomingIntent() {
        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("username") && getIntent().hasExtra("caption")
                && getIntent().hasExtra("accImage")){

            int imageUrl = getIntent().getIntExtra("image_url", 0);
            String username = getIntent().getStringExtra("username");
            String caption = getIntent().getStringExtra("caption");
            int accImage = getIntent().getIntExtra("accImage", 0);

            setImage(imageUrl, username, caption, accImage);
        }
    }

    private void setImage(int imageUrl, String username, String caption, int accImage){
        TextView username_text = findViewById(R.id.username_text);
        username_text.setText(username);

        TextView caption_text = findViewById(R.id.caption_text);
        caption_text.setText(caption);

        ImageView image = findViewById(R.id.post_image);
        image.setImageResource(imageUrl);

        ImageView user_photo_image = findViewById(R.id.user_photo_image);
        user_photo_image.setImageResource(accImage);
    }

    private void ConfigureBackButton() {
        ImageView backButton = (ImageView) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


}
