package com.tms.lesson9_hw.figureTask.figure;

public final class Circle extends Figure{
    public String name = "Circle";
    public double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
    public String getName(){
        return name;
    }
}
