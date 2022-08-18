package dev.christine.mypost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.christine.mypost.databinding.ActivityCommentBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class CommentActivity : AppCompatActivity() {
    lateinit var binding: ActivityCommentBinding
    var postId = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCommentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        obtainPost()
        fetchPosts()
    }
    fun obtainPost(){
        postId = intent.extras?.getInt("POST_ID")?: 0
    }
    fun fetchPosts(){
        var apiClient = APIClient.buildAPIClient(ApiInterface::class.java)
        var request = apiClient.getPostById(postId)

        request.enqueue(object: Callback<Posts>{
            override fun onResponse(call: Call<Posts>, response: Response<Posts>) {
               var posts = response.body()
                if (posts!= null){
                    binding.tvTitle.text = Posts.Title
                   binding.tvBody.text = Posts.body
                }
            }
//            var postId:Int,
//            var id :Int,
//            var name:String,
//            var email:String,
//            var body:String)

            override fun onFailure(call: Call<Posts>, t: Throwable) {

            }

        })


    }
}