package com.mahdiyar.creational;

public class CreationalPatterns implements Runnable {
    private static final FactoryPattern factoryPattern = new FactoryPattern();
    private static final AbstractFactoryPattern abstractFactoryPattern = new AbstractFactoryPattern();
    private static final BuilderPattern builderPattern = new BuilderPattern();
    private static final PrototypePattern prototypePattern = new PrototypePattern();
    private static final SingletonPattern singletonPattern = SingletonPattern.instance();

    @Override
    public void run() {
        factoryPattern.run();
        abstractFactoryPattern.run();
        builderPattern.run();
        prototypePattern.run();
        singletonPattern.run();
    }
}
