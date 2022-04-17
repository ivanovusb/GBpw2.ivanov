package com.example.gbpw2ivanov;

import android.content.Context;

public class SomeSingleton {

    private Context context;

    private static SomeSingleton INSTANCE;

    public static SomeSingleton getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new SomeSingleton(context);
        }
        return INSTANCE;
    }

    private SomeSingleton(Context context) {
        this.context = context;
    }
}
