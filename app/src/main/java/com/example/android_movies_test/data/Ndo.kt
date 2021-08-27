package com.example.android_movies_test.data

import com.pharosproduction.androidnestedrecycler.Holder

class Ndo(val value: String) : HasType {

    override fun getType(): Int {
        return Holder.NESTED.type;
    }
}