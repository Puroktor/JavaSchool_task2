package ru.dataart.academy.java.figures;

public class Rectangle extends Figure {
    private final double a, b;

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (a + b);
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
