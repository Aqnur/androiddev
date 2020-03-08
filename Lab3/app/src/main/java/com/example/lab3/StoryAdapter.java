package com.example.lab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder>{

    private Context mContext;
    private int images[];
    private String names[];

    public StoryAdapter(int[] images, String[] names, Context mContext) {
        this.images = images;
        this.names = names;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(mContext).inflate(R.layout.story_item, parent, false);
       ViewHolder viewHolder = new ViewHolder(view);
       return viewHolder;
   }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        int imageId = images[position];
        String username = names[position];
        holder.storyPhoto.setImageResource(imageId);
        holder.storyUser.setText(username);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView storyPhoto;
        TextView storyUser;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            storyPhoto = itemView.findViewById(R.id.storyPhoto);
            storyUser = itemView.findViewById(R.id.storyUser);

        }
    }

}
