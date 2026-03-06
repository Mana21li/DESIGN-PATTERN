package com.manali.designPatterns.creationalDesignPattern.SingletonPattern;

public class Singleton {
    private static volatile Singleton instance = null;

    private Singleton() {
        System.out.println("Singleton Constructor Called. New Object Created.");
    }

    private static class HolderClass {
        private static final Singleton INSTANCE = new Singleton();
    }
    //we have to let it create one object
    public static Singleton getInstance() {
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
        return HolderClass.INSTANCE;
    }
}
