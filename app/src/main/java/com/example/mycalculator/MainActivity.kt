package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var isAdd: Boolean = false
    var isSub: Boolean = false
    var isDiv: Boolean = false
    var isMul: Boolean = false
    var displayNumber: String=""
    var operand1:Float=0.0F
    var operand2:Float=0.0F
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun operationFunction(view: View){
        var textBox:EditText?=findViewById(R.id.text_box_id)
        when(view.id){
            R.id.button_one_id-> {
                displayNumber += "1"
                textBox?.setText(displayNumber)
            }
        }


    }
}