package com.afrosoft.testandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text = enterNameEdt.text
        showNameButton.setOnClickListener {
            if(text.isEmpty()){
                resultTxt.text = "Please Enter your name!"
            }else{
                resultTxt.text = "Welcome $text"
            }
        }

    }
}