package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private int[] images = {R.drawable.pic1,R.drawable.pic2,
            R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,
            R.drawable.pic6,R.drawable.pic7,R.drawable.pic8,
            R.drawable.pic9,R.drawable.pic10};

    private RecyclerViewAdapter adapter;

    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationViewEx bottom = findViewById(R.id.bottom_navigation_view);
        bottom.setIconSize(29f, 29f);
        bottom.setTextVisibility(false);
        bottom.enableItemShiftingMode(false);
        bottom.enableShiftingMode(false);
        bottom.enableAnimation(false);
        for (int i = 0; i < bottom.getMenu().size(); i++) {
            bottom.setIconTintList(i, null);
        }

        recyclerView = findViewById(R.id.feed_recycler);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerViewAdapter(images, this);
        recyclerView.setAdapter(adapter);
    }

}
