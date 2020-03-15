package com.form.bebeb

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.post_item.view.*

class PostsAdapter(private val posts: List<PostData>) :
    RecyclerView.Adapter<PostsAdapter.PostViewHolder>() {
    override fun getItemCount() = posts.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_item, parent, false)

        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bindData(posts[position])
    }

    inner class PostViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val titleTextView = itemView.titleTextView
        private val bodyTextView = itemView.bodyTextView
        private val userTextView = itemView.userTextView

        fun bindData(post: PostData) {
            titleTextView.text = post.title
            bodyTextView.text = post.body
            userTextView.text = post.username
        }
    }
}