package com.example.designpattern.pattern.singleton;

/*
 * 内部静态类
 * Singleton3类加载时,内部静态类不会加载，只有在调用getInstance方法时才会加载SingletonHolder
 * 由jvm保证线程安全
 */
public class Singleton3 {
    private Singleton3() {
    }

    private static class SingletonHolder{
        public static final Singleton3 INSTANC = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return SingletonHolder.INSTANC;
    }
}
