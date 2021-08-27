package com.example.android_movies_test.data

import com.example.android_movies_test.data.Ndo
import com.pharosproduction.androidnestedrecycler.Holder

class NestedDataObjectWrapper(val nestedDataObjectList: List<Ndo>) : HasType {

    override fun getType(): Int {
        return Holder.NESTED.type
    }
}