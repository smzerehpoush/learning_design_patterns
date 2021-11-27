package com.mahdiyar.creational;

import java.util.Date;
import java.util.Random;

public class AbstractFactoryPattern implements Runnable {
    @Override
    public void run() {
        System.out.println("==== Abstract Factory ====");
        ShapeFactory shapeFactory;
        var seed = new Date().getTime();
        var random = new Random(seed);
        for (int i = 0; i < 2; i++) {
            if (random.nextBoolean()) {
                shapeFactory = new CircleFactory();
            } else {
                shapeFactory = new RectangleFactory();
            }
            var drawer = new Drawer(shapeFactory);
            drawer.drawShape();
        }
        System.out.println("==== Abstract Factory ====");
    }

    interface Shape {
        void draw();
    }

    static class Circle implements Shape {

        @Override
        public void draw() {
            System.out.println("drawing circle");
        }
    }

    static class Rectangle implements Shape {

        @Override
        public void draw() {
            System.out.println("drawing rectangle");
        }
    }

    interface ShapeFactory {

        Shape createShape();
    }

    static class CircleFactory implements ShapeFactory {

        @Override
        public Shape createShape() {
            return new Circle();
        }
    }

    static class RectangleFactory implements ShapeFactory {

        @Override
        public Shape createShape() {
            return new Rectangle();
        }
    }

    static class Drawer {
        private final ShapeFactory shapeFactory;

        Drawer(ShapeFactory shapeFactory) {
            this.shapeFactory = shapeFactory;
        }

        public void drawShape() {
            shapeFactory.createShape().draw();
            System.out.println();
        }
    }
}
