package com.example.designpattern.pattern.singleton;

/*
 * 枚举类
 *
 */
public enum Singleton4 {

    INSTANCE("abc");

    private String name;

     Singleton4(String name) {
        this.name = name;
    }

    public static Singleton4 getInstance() {
        return Singleton4.INSTANCE;
    }

}
