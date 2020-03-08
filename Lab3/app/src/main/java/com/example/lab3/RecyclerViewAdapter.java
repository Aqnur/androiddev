package com.example.lab3;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import javax.xml.datatype.Duration;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ImageViewHolder>{

    private int[] images;
    private String[] names;
    private int[] accoutImages;
    private String[] captions;
    private static Context parent;
    private static boolean likeState = false;
    private static boolean izbrannoeState = false;
    public RecyclerViewAdapter(int[] images, String[] names, int[] accoutImages, String[] captions, Context parent){
        this.images = images;
        this.names = names;
        this.accoutImages = accoutImages;
        this.captions = captions;
        this.parent = parent;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.feed_item, parent, false);
        ImageViewHolder imageViewHolder = new ImageViewHolder(view);

        return imageViewHolder;
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, final int position){
        final int image_id = images[position];
        final String nameId = names[position];
        final int accImage_id = accoutImages[position];
        final String captionId= captions[position];

        String sourceString = "<b>" + nameId + "</b> " + captionId;

        holder.post_image.setImageResource(image_id);
        holder.username_text.setText(nameId);
        holder.user_photo_image.setImageResource(accImage_id);
        holder.caption_text.setText(Html.fromHtml(sourceString));

        holder.post_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(parent, PostActivity.class);
                intent.putExtra("image_url", image_id);
                intent.putExtra("username", nameId);
                intent.putExtra("accImage", accImage_id);
                intent.putExtra("caption", captionId);
                parent.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount(){
        return images.length;
    }

    @SuppressLint("")
    public static class ImageViewHolder extends RecyclerView.ViewHolder{
        ImageView post_image;
        TextView username_text;
        TextView caption_text;
        ImageView like_image;
        ImageView izbrannoe;
        TextView likes_text;
        CircleImageView user_photo_image;
        ConstraintLayout feed_recycler;

        public ImageViewHolder(View itemView) {
            super(itemView);
            post_image = itemView.findViewById(R.id.post_image);
            username_text = itemView.findViewById(R.id.username_text);
            caption_text = itemView.findViewById(R.id.caption_text);
            like_image = itemView.findViewById(R.id.like_image);
            izbrannoe = itemView.findViewById(R.id.izbrannoe);
            likes_text = itemView.findViewById(R.id.likes_text);
            user_photo_image = itemView.findViewById(R.id.user_photo_image);
            feed_recycler = itemView.findViewById(R.id.feed_recycler);

            like_image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(likeState == false){
                        like_image.setImageResource(R.drawable.ic_liked);
                        likeState = true;
                        likes_text.setText("239");
                    }else{
                        like_image.setImageResource(R.drawable.like_photo);
                        likeState = false;
                        likes_text.setText("238");
                    }
                    Toast.makeText(parent, "Liked", Toast.LENGTH_SHORT).show();
                }
            });

            izbrannoe.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(izbrannoeState == false){
                        izbrannoe.setImageResource(R.drawable.ic_izbrannoe_nazhatie);
                        izbrannoeState = true;
                    }else{
                        izbrannoe.setImageResource(R.drawable.ic_izbrannoe);
                        izbrannoeState = false;
                    }
                }
            });
        }
    }
}