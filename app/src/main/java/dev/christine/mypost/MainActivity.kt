package dev.christine.mypost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import dev.christine.mypost.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
   lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getPosts()
    }
    fun getPosts(){
        val retrofit = APIClient.buildAPIClient((ApiInterface::class.java))
        val request=retrofit.getPosts()

        request.enqueue(object :Callback<List<Posts>>{
            override fun onResponse(call: Call<List<Posts>>, response: Response<List<Posts>>) {
                if(response.isSuccessful){
                    val posts = response.body()
                    Toast.makeText(baseContext,"fetched ${posts!!.size}posts",
                    Toast.LENGTH_LONG).show()
//
//                    var postAdapter = PostAdapter(baseContext,Posts)
//                     binding.rvRetrofit= layoutInflater.LinearLayoutManager(baseContext)
//                    binding.rvRetrofit.adapter = dev.christine.mypost.PostAdapter

                }
            }

            override fun onFailure(call: Call<List<Posts>>, t: Throwable) {

            }

        })
    }
    fun displayPosts(postsList: List<Posts>){
        binding.rvPosts.layoutManager=LinearLayoutManager(this)
        var PostAdapter=PostsRecylerView(postsList)
//        binding.rvPosts.adapter=PostAdapter
    }

}