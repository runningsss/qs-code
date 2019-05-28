package com.learning.singleton;

/**
 * @author liqings
 * @date 2019-05-06
 */
public class SynSingleton {

    // volatile主要作用是保证有序性，禁止指令重排序
    private static volatile SynSingleton singleton = null;

    private SynSingleton() {
    }

    public static SynSingleton getInstance() {

        if (singleton == null) {
            synchronized (SynSingleton.class) {
                if (singleton == null) {
                    singleton = new SynSingleton();
                }
            }
        }

        return singleton;
    }
}
