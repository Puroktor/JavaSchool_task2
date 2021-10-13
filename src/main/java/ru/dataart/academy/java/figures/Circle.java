package ru.dataart.academy.java.figures;

public class Circle extends Figure {
    private final double r;

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }

    public Circle(double r) {
        this.r = r;
    }
}
