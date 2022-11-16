package com.example.designpattern.pattern.singleton;

/*
 * 饿汉式
 * 类加载时创建实例，由jvm保证线程安全
 */
public class Singleton1 {
    private static final Singleton1 SINGLETON = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return SINGLETON;
    }
}
