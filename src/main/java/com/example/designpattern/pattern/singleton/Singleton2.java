package com.example.designpattern.pattern.singleton;

/*
 * 懒汉式
 * 使用时才创建实例
 */
public class Singleton2 {
    private static Singleton2 SINGLETON = null;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (SINGLETON != null) {
            return SINGLETON;
        } else {
            synchronized (Singleton2.class) {
                if (SINGLETON == null) {
                    SINGLETON = new Singleton2();
                }
                return SINGLETON;
            }
        }
    }
}
