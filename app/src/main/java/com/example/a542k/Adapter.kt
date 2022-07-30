package com.example.a542k

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class Adapter(var context: Context, var items: ArrayList<Story>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_stories, parent, false)
        return StoryHolder(view)
    }

    override fun onBindViewHolder( holder: RecyclerView.ViewHolder, position: Int) {
       val story = items[position]

        if (holder is StoryHolder){
            holder.i_text.text = story.i_text
            holder.i_image.setImageResource(story.i_image)
            holder.i_profile.setImageResource(story.i_profile)
            holder.counter.setImageResource(story.counter)

            if (position == 0){
                holder.counter.visibility = View.GONE
            }else{
                holder.counter.visibility = View.VISIBLE
            }
        }
    }

    override fun getItemCount(): Int {
      return items.size
    }

    class StoryHolder( view: View): RecyclerView.ViewHolder(view){
         var i_text: TextView
         var i_profile: ShapeableImageView
         var i_image: ImageView
         var counter: ShapeableImageView = view.findViewById(R.id.counter)

        init {
            i_profile = view.findViewById(R.id.i_profile)
            i_image = view.findViewById(R.id.i_image)
            i_text = view.findViewById(R.id.i_text)

        }
    }
}