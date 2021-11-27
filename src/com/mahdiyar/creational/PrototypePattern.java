package com.mahdiyar.creational;

public class PrototypePattern implements Runnable {
    @Override
    public void run() {
        System.out.println("==== Prototype ====");
        var shape1 = new Shape(1, 2);
        Shape shape2 ;
        try {
            shape2 = (Shape) shape1.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("error in cloning object" + e);
            throw new RuntimeException();
        }
        System.out.println("shape 1 " + shape1 + " hash code : " + shape1.hashCode());
        System.out.println("shape 2 " + shape2 + " hash code : " + shape2.hashCode());
        System.out.println("==== Prototype ====");
    }

    static class Shape {
        private final int with;
        private final int height;


        public Shape(int with, int height) {
            this.with = with;
            this.height = height;
        }

        public Shape(Shape shape) {
            this.with = shape.with;
            this.height = shape.height;
        }

        @Override
        public String toString() {
            return "Shape{" +
                    "with=" + with +
                    ", height=" + height +
                    '}';
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return new Shape(this);
        }
    }
}


