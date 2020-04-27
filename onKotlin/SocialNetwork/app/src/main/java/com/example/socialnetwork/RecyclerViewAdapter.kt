package com.example.socialnetwork

import android.content.Context
import android.content.Intent
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView


class RecyclerViewAdapter(private val images: IntArray,
                          private val names: Array<String>,
                          private val accoutImages: IntArray,
                          private val captions: Array<String>,
                          private val parent: Context? = null
): RecyclerView.Adapter<RecyclerViewAdapter.ImageViewHolder>() {

    private var likeState = false
    private var izbrannoeState = false

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerViewAdapter.ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.feed_item, parent, false)
        return ImageViewHolder(view)
    }

    override fun getItemCount(): Int {
        return images.size;
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.ImageViewHolder, position: Int) {
        val image_id = images[position]
        val nameId = names[position]
        val accImage_id = accoutImages[position]
        val captionId = captions[position]

        val sourceString = "<b>$nameId</b> $captionId"

        holder.post_image.setImageResource(image_id)
        holder.username_text.text = nameId
        holder.user_photo_image.setImageResource(accImage_id)
        holder.caption_text.text = Html.fromHtml(sourceString)

        holder.post_image.setOnClickListener {
            val intent = Intent(parent, PostActivity::class.java)
            intent.putExtra("image_url", image_id)
            intent.putExtra("username", nameId)
            intent.putExtra("accImage", accImage_id)
            intent.putExtra("caption", captionId)
            parent!!.startActivity(intent)
        }
    }

    inner class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var post_image: ImageView = view.findViewById(R.id.post_image)
        var username_text: TextView = view.findViewById(R.id.username_text)
        var caption_text: TextView = view.findViewById(R.id.caption_text)
        var like_image: ImageView = view.findViewById(R.id.like_image)
        var izbrannoe: ImageView = view.findViewById(R.id.izbrannoe)
        var likes_text: TextView = view.findViewById(R.id.likes_text)
        var user_photo_image: CircleImageView = view.findViewById(R.id.user_photo_image)
        var feed_recycler: ConstraintLayout = view.findViewById(R.id.feed_recycler)

        fun bind(itemView: View){
            like_image.setOnClickListener {
                if(likeState == false) {
                    like_image.setImageResource(R.drawable.ic_liked)
                    likeState = true
                    likes_text.text = "239"
                } else {
                    like_image.setImageResource(R.drawable.like_photo);
                    likeState = false
                    likes_text.text = "238"
                }
                Toast.makeText(parent, "Liked", Toast.LENGTH_SHORT).show()
            }

            izbrannoe.setOnClickListener {
                if(izbrannoeState == false) {
                    izbrannoe.setImageResource(R.drawable.ic_izbrannoe_nazhatie);
                    izbrannoeState = true;
                } else {
                    izbrannoe.setImageResource(R.drawable.ic_izbrannoe);
                    izbrannoeState = false;
                }
            }
        }
    }

}