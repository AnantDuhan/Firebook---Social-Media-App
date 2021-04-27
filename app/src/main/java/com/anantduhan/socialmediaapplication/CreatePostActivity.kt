 package com.anantduhan.socialmediaapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anantduhan.socialmediaapplication.daos.PostDao
import kotlinx.android.synthetic.main.activity_create_post.*

 class CreatePostActivity : AppCompatActivity() {

     private lateinit var postDao: PostDao

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_create_post)

         actionBar?.hide()

         postDao = PostDao()

         postButton.setOnClickListener {
             val input = postInput.text.toString().trim()
             if(input.isNotEmpty()) {
                 postDao.addPost(input)
                 finish()
             }
         }

         setUpRecyclerView()
     }

     private fun setUpRecyclerView() {

     }
 }