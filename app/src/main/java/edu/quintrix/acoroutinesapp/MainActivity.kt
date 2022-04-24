package edu.quintrix.acoroutinesapp

import android.content.ContentValues.TAG
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import edu.quintrix.acoroutinesapp.databinding.ActivityMainBinding

import kotlinx.coroutines.*
import java.net.HttpURLConnection
import java.net.URL

private lateinit var binding : ActivityMainBinding

var index = 0

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)

        view.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(view: View, m: MotionEvent): Boolean {
                Log.i(TAG, "Entered onTouch()")
                handleTouch(m)
                return true
            }

        })





    }

    private fun handleTouch(m:MotionEvent) {
        Log.d(TAG, "Entered handleTouch()")

        val pointerCount = m.pointerCount
        for (i in 0 until pointerCount) {
            val x = m.getX(i)
            val y = m.getY(i)

            val id = m.getPointerId(i)
            val action = m.actionMasked
            val actionIndex = m.actionIndex
            val actionString : String

            when (action) {
//                MotionEvent.ACTION_DOWN -> //actionString = "DOWN"
//                MotionEvent.ACTION_UP -> //actionString = "UP"
//                MotionEvent.ACTION_POINTER_UP -> //actionString = "PNTR UP"
//                MotionEvent.ACTION_POINTER_DOWN -> //actionString = "PNTR DOWN"
//                MotionEvent.ACTION_MOVE ->// actionString = "MOVE"
//                else -> actionString = ""
                MotionEvent.ACTION_MOVE -> {

                    if (index >= 9) {
                        index = 0
                    } else {
                        index++
                    }

                }


            }

            //val touchStatus = "Action: $actionString Index: $actionIndex ID: $id X: $x Y: $y"



            binding.textStatus.text = commonData.getImageDescriptionAtIndex(index)

            GlobalScope.launch(Dispatchers.IO) {

                Log.i(TAG, "entered GlobalScope.launch(dispatchers.IO) ... ")

                val imageUrl = URL(commonData.getImageUrlAtIndex(index))
                val httpConnection: HttpURLConnection =
                    imageUrl.openConnection() as HttpURLConnection
                httpConnection.doInput = true
                httpConnection.connect()

                Log.i(
                    TAG,
                    "Making http connection ... connect(). response code: ${httpConnection.responseCode}"
                )

                val inputStream = httpConnection.inputStream
                val bitmapImage = BitmapFactory.decodeStream(inputStream)
                launch(Dispatchers.Main) {
                    Log.i("UI", "thread ${Thread.currentThread().name} is setting the image")
                    binding.imageView.setImageBitmap(bitmapImage)
                }

            }

        }
    }


}