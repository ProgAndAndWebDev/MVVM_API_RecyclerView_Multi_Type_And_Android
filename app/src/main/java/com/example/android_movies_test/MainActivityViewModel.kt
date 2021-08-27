package com.example.android_movies_test

import android.util.Log
import androidx.lifecycle.*
import com.example.android_movies_test.repository.Repository
import com.pharosproduction.androidnestedrecycler.RvOnClickListener
import com.pharosproduction.androidnestedrecycler.adapter.ParentAdapter

class MainActivityViewModel : ViewModel(), LifecycleObserver {

    // Variables
    private val repository = Repository
    var adapter = ParentAdapter()

    // Lifecycle
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        adapter.setOnClickListener(object : RvOnClickListener {
            override fun onItmClick(parentPosition: Int, nestedPosition: Int?) {
                Log.d("POSITION", "parent position - $parentPosition, nested position -  $nestedPosition")
            }

        })
        adapter.setData(dataList = Repository.mok)
    }
}