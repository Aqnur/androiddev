package com.example.lab3;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ImageViewHolder>{

    private int[] images;
    private static Context parent;


    public RecyclerViewAdapter(int[] images, Context parent){
        this.images = images;
        this.parent = parent;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.feed_item, parent, false);
        ImageViewHolder imageViewHolder = new ImageViewHolder(view);

        return imageViewHolder;
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position){
        int image_id = images[position];
        holder.post_image.setImageResource(image_id);
        holder.username_text.setText("Aknur Toktarov" +position);
    }

    @Override
    public int getItemCount(){
        return images.length;
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder{
        ImageView post_image;
        TextView username_text;
        ImageView like_image;
        public ImageViewHolder(View itemView) {
            super(itemView);
            post_image = itemView.findViewById(R.id.post_image);
            username_text = itemView.findViewById(R.id.username_text);
            like_image = itemView.findViewById(R.id.like_image);

            like_image.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    int positionIndex = getAdapterPosition();
                    Toast toast = Toast.makeText(parent, "Liked", Toast.LENGTH_SHORT);
                    toast.show();
                }
            });

        }
//        public void showToast(){
//            LayoutInflater inflater = getLayoutInflater();
//            View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.toast_root));
//
//            TextView toastText = layout.findViewById(R.id.toast_text);
//            ImageView toastImage = layout.findViewById(R.id.toast_image);
//
//            toastImage.setImageResource(R.drawable.ic_liked);
//
//            Toast toast = new Toast(getApplicationContext());
//            toast.setDuration(Toast.LENGTH_LONG);
//            toast.setView(layout);
//
//            toast.show();
//        }
    }
}