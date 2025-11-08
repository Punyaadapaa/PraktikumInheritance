/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum7;

/**
 *
 * @author WORKPLUS
 */
abstract class Shape {
    abstract double area();
}

class Triangle extends Shape {
    double base;
    double height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double length;
    double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class LatihanShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle(4, 5);
        shapes[1] = new Rectangle(8, 6);
        shapes[2] = new Circle(7);
        
        double totalArea = 0;
        for (Shape shape : shapes) {
            double area = shape.area();
            System.out.println("Area: " + area);
            totalArea += area;
        }
        
        System.out.println("\nTotal area: " + totalArea);
    }
}