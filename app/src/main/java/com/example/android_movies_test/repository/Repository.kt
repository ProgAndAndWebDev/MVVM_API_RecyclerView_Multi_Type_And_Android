package com.example.android_movies_test.repository

import com.example.android_movies_test.data.HasType
import com.example.android_movies_test.data.Ndo
import com.example.android_movies_test.data.NestedDataObjectWrapper
import com.example.android_movies_test.data.Pdo

object Repository {

    val mok:List<HasType> = listOf(
        Pdo(1),
        Pdo(2),
        NestedDataObjectWrapper(
            listOf(Ndo("ddjd"), Ndo("dqqw"), Ndo("wwww"), Ndo("wwrv"))
        ),
        Pdo(4),
        Pdo(5),
        Pdo(6),
        NestedDataObjectWrapper(
            listOf(Ndo("ddjd"), Ndo("dqqw"), Ndo("wwww"), Ndo("wwrv"))
        ),
        Pdo(8),
        Pdo(9),
        Pdo(10),
        Pdo(11),
        Pdo(12),
        Pdo(13),
        NestedDataObjectWrapper(
            listOf(Ndo("ddjd"), Ndo("dqqw"), Ndo("wwww"), Ndo("wwrv"))
        ),
        Pdo(15),
        Pdo(16),
        Pdo(17)
    )

}