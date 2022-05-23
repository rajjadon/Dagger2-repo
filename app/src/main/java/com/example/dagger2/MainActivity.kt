package com.example.dagger2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import java.text.SimpleDateFormat
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var obj: SimpleDateFormat

    @Inject
    lateinit var mainActivity2ViewModel: MainActivity2ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidInjection.inject(this)


        Log.e("injection", obj.toString())
    }
}