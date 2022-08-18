package dev.christine.mypost

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.christine.mypost.databinding.PostlistitemBinding

class RvComment (var postlist: List<Posts>):
    RecyclerView.Adapter<RetrofitViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RetrofitViewHolder {
            var bindingView = PostlistitemBinding
                .inflate(LayoutInflater.from(parent.context), parent, false)
            return RetrofitViewHolder(bindingView)
        }

        override fun onBindViewHolder(holder: RetrofitViewHolder, position: Int) {
//        val context = holder.itemView.context
            var currentPost = postlist.get(position)

            var context = holder.itemView.context
            holder.bindingView.tvName.setOnClickListener {
                val  intent = Intent(context, CommentActivity::class.java)
                intent.putExtra("POST_ID", currentPost.id)
                context.startActivity(intent)
            }

            with(holder.bindingView){
//                tvUserId.tv = currentPost.userId.toString()
//                tvId.text = currentPost.id.toString()
                tvTitle.text = currentPost.tittle
                tvName.text = currentPost.body
            }

        }

        override fun getItemCount(): Int {
            return postlist.size
        }
    }

    class RetrofitViewHolder(var bindingView: PostlistitemBinding):
        RecyclerView.ViewHolder(bindingView.root){
}
