package com.mahdiyar.creational;

public class BuilderPattern implements Runnable {
    @Override
    public void run() {
        System.out.println("==== Builder ====");

        var car = new Car()
                .brand("BMW")
                .color("RED")
                .creationYear(2016)
                .model("X4")
                .ownerName("Mahdiyar");
        System.out.println(car);
        System.out.println("==== Builder ====");
    }

    static class Car {
        private String color;
        private String brand;
        private String model;
        private String ownerName;
        private int creationYear;

        public Car color(String color) {
            this.color = color;
            return this;
        }

        public Car brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Car model(String model) {
            this.model = model;
            return this;
        }

        public Car ownerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        public Car creationYear(int creationYear) {
            this.creationYear = creationYear;
            return this;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "color='" + color + '\'' +
                    ", brand='" + brand + '\'' +
                    ", model='" + model + '\'' +
                    ", ownerName='" + ownerName + '\'' +
                    ", creationYear=" + creationYear +
                    '}';
        }
    }
}
