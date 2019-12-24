package com.example.messages

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.messages.api.IApiCallback
import com.example.messages.api.MyCallback
import com.example.messages.api.dto.DTOMessage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getMessage()
        swipe.setOnRefreshListener { getMessage() }
    }

    private fun getMessage() {

        val huita: MessagesApplication = application as MessagesApplication
        val obj = object : IApiCallback<List<DTOMessage>> {
            override fun onData(data: List<DTOMessage>) {
                swipe.isRefreshing = false
                success(data)
            }

            override fun onError() {

            }
        }
        huita.api?.getMessages()?.enqueue(MyCallback(obj))
    }


    private fun success(models : List<DTOMessage>) {
        recycler.layoutManager = LinearLayoutManager(this@MainActivity)
        recycler.adapter = MessageAdapter(models, this)
    }
}
