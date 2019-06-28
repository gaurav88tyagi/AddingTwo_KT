package com.example.addingtwo_kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {

            if(TextUtils.isEmpty(etFirstNum.text.toString()) || TextUtils.isEmpty(etSecondNum.text.toString()))
            {
                tv.text = ""
                Toast.makeText(this, "Invalid Input",LENGTH_SHORT).show()
            }

            var firstNum = etFirstNum.text.toString().toInt()
            var secondNum = etSecondNum.text.toString().toInt()

            tv.text = firstNum.toString() + " + " + secondNum.toString() + " = " + (firstNum + secondNum).toString()

        }

        btnReset.setOnClickListener {

            etFirstNum.setText("")
            etSecondNum.setText("")
            tv.text = ""

        }

    }
}
