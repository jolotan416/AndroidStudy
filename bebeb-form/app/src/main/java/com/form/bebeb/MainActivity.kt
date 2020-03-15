package com.form.bebeb

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var posts: List<PostData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        initializePosts()
        configureRecyclerView()
    }

    private fun initializePosts() {
        posts = listOf(
            PostData("I am number 1", "This post is number 1", "User 1"),
            PostData("I am number 2", "This post is number 2", "User 2"),
            PostData("I am number 3", "This post is number 3", "User 3"),
            PostData("I am number 4", "This post is number 4", "User 4"),
            PostData("I am number 5", "This post is number 5", "User 5"),
            PostData("I am number 6", "This post is number 6", "User 6"),
            PostData("I am number 7", "This post is number 7", "User 7"),
            PostData("I am number 8", "This post is number 8", "User 8"),
            PostData("I am number 9", "This post is number 9", "User 9"),
            PostData("I am number 10", "This post is number 10", "User 10"),
            PostData("I am number 11", "This post is number 11", "User 11"),
            PostData("I am number 12", "This post is number 12", "User 12"),
            PostData("I am number 13", "This post is number 13", "User 13"),
            PostData("I am number 14", "This post is number 14", "User 14"),
            PostData("I am number 15", "This post is number 15", "User 15"),
            PostData("I am number 16", "This post is number 16", "User 16"),
            PostData("I am number 17", "This post is number 17", "User 17"),
            PostData("I am number 18", "This post is number 18", "User 18"),
            PostData("I am number 19", "This post is number 19", "User 19"),
            PostData("I am number 20", "This post is number 20", "User 20")
        )

        Log.d("JOLOG", "[JOLOG] Posts: $posts")
    }

    private fun configureRecyclerView() {
        postsRecyclerView.adapter = PostsAdapter(posts)
        postsRecyclerView.layoutManager = LinearLayoutManager(this)
        postsRecyclerView.setHasFixedSize(true)
    }
}
