package com.example.a542k

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

 private fun initViews(){
    recyclerView = findViewById(R.id.rv)
    recyclerView.layoutManager = GridLayoutManager(this, 2)

    refreshAdapter(getAllChats())
}

private fun refreshAdapter(chats: ArrayList<Story>){
    val adapter = Adapter(this, chats)
    recyclerView.adapter = adapter
}

private fun getAllChats(): ArrayList<Story> {
    val chats: ArrayList<Story> = ArrayList()

    chats.add(Story(R.drawable.plus, R.drawable.nissan,"Add to Story", R.drawable.one ))
    chats.add(Story(R.drawable.volkswagen,R.drawable.mbw,"Nick Johnson", R.drawable.one   ))
    chats.add(Story(R.drawable.nissan,R.drawable.mbw,"Emma Watson" , R.drawable.one  ))
    chats.add(Story(R.drawable.mbw,R.drawable.volkswagen,"Sarah Trevor" , R.drawable.one ))
    chats.add(Story(R.drawable.mbw, R.drawable.nissan,"Sarah Trevor" , R.drawable.one ))
    chats.add(Story(R.drawable.volkswagen,R.drawable.mbw,"Nick Johnson" , R.drawable.one  ))
    chats.add(Story(R.drawable.nissan,R.drawable.mbw,"Emma Watson", R.drawable.one   ))
    chats.add(Story(R.drawable.mbw,R.drawable.volkswagen,"Sarah Trevor", R.drawable.one  ))
    chats.add(Story(R.drawable.mbw, R.drawable.nissan,"Sarah Trevor", R.drawable.one  ))
    chats.add(Story(R.drawable.volkswagen,R.drawable.mbw,"Nick Johnson", R.drawable.one   ))
    chats.add(Story(R.drawable.nissan,R.drawable.mbw,"Emma Watson" , R.drawable.one  ))
    chats.add(Story(R.drawable.mbw,R.drawable.volkswagen,"Sarah Trevor", R.drawable.one  ))

    return chats
  }
}