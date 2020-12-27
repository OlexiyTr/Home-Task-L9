package com.example.homework9
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.view.View

class MainActivity : AppCompatActivity(){
    val tag = "123"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }

    fun onClickPlus(view: View?) {
        val numA = findViewById<EditText>(R.id.textA).text.toString().toDouble()
        val numB = findViewById<EditText>(R.id.textB).text.toString().toDouble()

        //var intent = Intent()
        //startService(intent.putExtra("valueA",numA).putExtra("valueB",numB).putExtra("Operator","+"))

        view?.setOnClickListener{
            Log.d(tag,"On plus")
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, MyFragment.newInstance(numA + numB))
                .commit()
        }
    }
    fun onClickMinus(view: View?) {
        val numA = findViewById<EditText>(R.id.textA).text.toString().toDouble()
        val numB = findViewById<EditText>(R.id.textB).text.toString().toDouble()

        //var intent = Intent()
        //startService(intent.putExtra("valueA",numA).putExtra("valueB",numB).putExtra("Operator","-"))

        view?.setOnClickListener{
            Log.d(tag,"On minus")
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, MyFragment.newInstance(numA - numB))
                .commit()
        }

    }
    fun onClickMulti(view: View?) {
        val numA = findViewById<EditText>(R.id.textA).text.toString().toDouble()
        val numB = findViewById<EditText>(R.id.textB).text.toString().toDouble()

        //var intent = Intent()
        //startService(intent.putExtra("valueA",numA).putExtra("valueB",numB).putExtra("Operator","*"))

        view?.setOnClickListener{
            Log.d(tag,"On multi")
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, MyFragment.newInstance(numA * numB))
                .commit()
        }

    }
    fun onClickDivision(view: View?) {
        val numA = findViewById<EditText>(R.id.textA).text.toString().toDouble()
        val numB = findViewById<EditText>(R.id.textB).text.toString().toDouble()

        //var intent = Intent()
        //startService(intent.putExtra("valueA",numA).putExtra("valueB",numB).putExtra("Operator","/"))

        view?.setOnClickListener{
            Log.d(tag,"On division")
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, MyFragment.newInstance(numA / numB))
                .commit()
        }

    }

}

