package dev.christine.mypost

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PostAdapter (var comment :Comment , var post:List<Posts>):RecyclerView.Adapter<PostViewHolder>()
     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        var binding = PostsBinding.inflate(LayoutInflater.from(context),parent,false)
        return PostViewHolder(bindingView) TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        var currentPost = Posts[position]
        with(holder.binding){
            tvId = currentPost.id.toString
            tvUserId = currentPost.userid
            tvTittle = currentPost.body
    }

    override fun getItemCount(): Int {
        return  Posts .size
    }


}
Class PostViewHolder(var binding:PostsBinding):RecylerView.ViewHolder(binding.root)