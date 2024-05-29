/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_theory;

import java.util.*;

public class Circle {
    double radius;
//radius=1.0
//    double Area;
//    double Perimeter;

    public Circle() {
    }

    Circle(double newRadius) {
        radius = newRadius;
    }
    
    public double getArea() 
    { 
        return (radius*radius * Math.PI);
    }

    public double getPerimeter() 
    { 
        return (2*radius * Math.PI);
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
}

class Solution{
    public static void main(String[] args) {
        Circle c1=new Circle();
        
        System.out.println(c1.radius);  
        System.out.println(c1.getRadius()); 
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());
    }
}
