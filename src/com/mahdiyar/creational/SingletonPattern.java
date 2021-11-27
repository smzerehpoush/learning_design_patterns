package com.mahdiyar.creational;

public class SingletonPattern implements Runnable {
    private static final SingletonPattern instance = new SingletonPattern();

    private SingletonPattern() {
        System.out.println("private constructor");
    }

    public static SingletonPattern instance() {
        return instance;
    }

    public void doSomeThing() {
        System.out.println("doing something...");
    }

    @Override
    public void run() {
        var instance1 = SingletonPattern.instance();
        var instance2 = SingletonPattern.instance();
        System.out.println("==== Singleton ====");
        instance1.doSomeThing();
        System.out.println("instance 1 hashcode: " + instance1.hashCode());
        instance2.doSomeThing();
        System.out.println("instance 2 hashcode: " + instance2.hashCode());
        System.out.println("==== Singleton ====");
    }
}
