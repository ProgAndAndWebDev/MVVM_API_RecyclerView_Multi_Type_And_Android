package com.example.android_movies_test.data

import com.pharosproduction.androidnestedrecycler.Holder

data class Pdo(val value: Int) : HasType {

    override fun getType(): Int {
        return Holder.PARENT.type
    }
}