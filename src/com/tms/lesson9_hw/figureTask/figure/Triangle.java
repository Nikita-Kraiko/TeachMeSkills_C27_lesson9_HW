package com.tms.lesson9_hw.figureTask.figure;

public final class Triangle extends Figure{
    public String name = "Triangle";
    public double sideA;
    public double sideB;
    public double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    @Override
    public double getArea() {

        double p = (sideA+sideB+sideC)/2;
        double area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = sideA+sideB+sideC;
        return perimeter;
    }
    public String getName(){
        return name;
    }

}
