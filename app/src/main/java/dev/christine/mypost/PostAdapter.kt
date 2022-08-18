package dev.christine.mypost

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.christine.mypost.databinding.PostlistitemBinding

class PostAdapter (var postList: List<Posts>):
//        RecyclerView.Adapter<PostViewHolder>(){
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
//    var binding = PostlistitemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
//       return  PostViewHolder(binding)
//    }
//    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
//      var currentPost = postList.get(position)
////        holder.binding.tvTitle.text = currentPost.tittle
////        holder.binding.tvName.text= currentPost.bodywith(holder.binding) {
//        with(holder.binding) {
//        tvName.text = currentPost.userID.toString()
//         tvWords.text = currentPost.id.toString()
//         tvNumber.text = currentPost.title
//        tvTittle.text = currentPost.body
//            var context = holder.itemView.context
////            holder.binding.cvPost
//        val intent = Intent(context,CommentActivity::class.java)
//        intent.putExtra("POST_ID",currentPost.id)
//        context.startActivity(intent)
////     with(holder.binding) {
////         tvName.text = currentPost.userID.toString()
//         tvWords.text = currentPost.id.toString()
//         tvNumber.text = currentPost.title
//        tvTittle.text = currentPost.body

//      }
////  holder.binding.imageView4.setOnClickListener{
//      Toast
//               .makeText(context, "You have clicked on my face", Toast.LENGTH_LONG)
//               .show()   }
//}
//   override fun getItemCount(): Int {
//  return postList.size
//  }
//}
//class PostViewHolder(var binding: PostlistitemBinding) :
//   RecyclerView.ViewHolder(binding.root)

