package com.kyeljmd.notes.dp.singleton;

/**
 * Created by kyel on 2/11/2017.
 */
public class Singleton {

    private static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton myInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }
}
