package com.example.android_movies_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.android_movies_test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Variables
    val mModel: MainActivityViewModel by viewModels()

    // Life
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DataBindingUtil
            .setContentView<ActivityMainBinding>(
                this, R.layout.activity_main).apply {
                    model = mModel
                    setLifecycleOwner(this@MainActivity)
                    lifecycle.addObserver(mModel)
        }
    }
}