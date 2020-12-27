package com.example.homework9

import android.app.IntentService
import android.content.Intent
import android.util.Log

class MyService : IntentService("MyIntent") {

    val tag = "Result"
    val ACTION_MYINTENTSERVICE = "My RESPONSE"
    val EXTRA_KEY_OUT = "EXTRA_OUT"
    var res : Double = 0.0

    override fun onHandleIntent(intent: Intent?) {
        val a = intent?.getDoubleExtra("valueA",0.0)
        val b = intent?.getDoubleExtra("valueB",1.0)
        val oper = intent?.getStringExtra("Operator")

        if (oper == "+"){
            if (a != null && b != null){
                res = a + b
                Log.d(tag, "$res")
            }
        }
        else if (oper == "-"){
            val res = b?.let{ a?.minus(it) }
            Log.d(tag, "$res")
        } else if (oper == "*"){
            val res = b?.let { a?.times(it) }
            Log.d(tag, "$res")
        }else if (oper == "+"){
            val res = b?.let { a?.div(it) }
            Log.d(tag, "$res")
        }
        val responseIntent = Intent()
        responseIntent.setAction(ACTION_MYINTENTSERVICE)
        responseIntent.addCategory(Intent.CATEGORY_DEFAULT)
        responseIntent.putExtra(EXTRA_KEY_OUT,res)
        sendBroadcast(responseIntent)
    }

}

//class MyService : Service(){
//
//    val LOG_TAG = "myLog"
//    val a : Double? = null
//    val b : Double? = null
//    val view : View? = null
//    var res : Double = 0.0
//
//    override fun onCreate() {
//        super.onCreate()
//    }
//
//    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
//        view?.let(this::someTask)
//        return super.onStartCommand(intent, flags, startId)
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//    }
//
//    override fun onBind(intent: Intent?): IBinder? {
//        Log.d(LOG_TAG,"onBind")
//        return null
//    }
//    fun someTask(view : View){
//        if (view?.id == R.id.buttonPlus){
//            if (a != null && b != null) {
//                res = a + b
//            }
//        }
//        else if(view?.id == R.id.buttonMinus){
//            if (a != null && b != null) {
//                res = a - b
//            }
//        }
//        else if(view?.id == R.id.buttonMulti){
//            if (a != null && b != null) {
//                res = a * b
//            }
//        }
//        else if(view?.id == R.id.buttonDiv){
//            if (a != null && b != null) {
//                res = a * b
//            }
//        }
//    }
//
//}