package com.tms.lesson9_hw.figureTask.figure;

public abstract sealed class Figure permits Circle, Triangle, Rectangle {
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String getName();



}
