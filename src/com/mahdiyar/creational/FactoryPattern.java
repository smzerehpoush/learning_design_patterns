package com.mahdiyar.creational;

import java.util.Date;
import java.util.Random;

public class FactoryPattern implements Runnable {
    @Override
    public void run() {
        System.out.println("==== Factory ====");
        var seed = new Date().getTime();
        var random = new Random(seed);
        for (int i = 0; i < 2; i++) {
            var distance = random.nextInt(5000);
            Transporter transporter;
            System.out.println("distance is " + distance + " so ");
            if (distance <= 1000) {
                transporter = new Transporter(new Car());
            } else {
                transporter = new Transporter(new Ship());
            }
            transporter.transfer("Some Thing");
            System.out.println("\n");
        }
        System.out.println("==== Factory ====");
    }

    static class Transporter {
        private final Transport transport;

        Transporter(Transport transport) {
            this.transport = transport;
        }

        public void transfer(String thing) {
            transport.deliver(thing);
        }
    }

    interface Transport {
        void deliver(String thing);
    }

    static class Car implements Transport {

        @Override
        public void deliver(String thing) {
            System.out.println("delivering " + thing + " via car");
        }
    }

    static class Ship implements Transport {

        @Override
        public void deliver(String thing) {
            System.out.println("delivering " + thing + " via ship");
        }
    }
}
