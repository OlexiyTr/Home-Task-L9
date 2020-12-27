package com.example.homework9

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class MyBroadcastReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        val result = intent?.getStringExtra(MyService().EXTRA_KEY_OUT)

    }

}