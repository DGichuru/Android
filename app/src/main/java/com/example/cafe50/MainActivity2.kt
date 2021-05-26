package com.example.cafe50

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity2 : AppCompatActivity() {


    var numberOfClicks = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            clickMeButton.setOnClickListener {
                numberOfClicks += 1

                messageText.text = "Clicked $numberOfClicks times"

                if(numberOfClicks < 10) {

                    conditionalMessageText.text = "Keep clicking"
                }else {
                    conditionalMessageText.text = "Nice Start"
                }
        }

    }
}