/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum7;

/**
 *
 * @author WORKPLUS
 */
class Vehicle {
    String brand; 

    void start() { 
        System.out.println("vehicle starts");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println(brand + " car starts with push engine start");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println(brand + " motorcycle starts with kick start");
    }
}

public class LatihanKendaraan {
    public static void main(String[] args) {
        
        Vehicle[] vehicles = new Vehicle[2];

        Car mobil = new Car();
        mobil.brand = "Toyota";

        Motorcycle motor = new Motorcycle();
        motor.brand = "Honda";

        vehicles[0] = mobil;
        vehicles[1] = motor;

        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}