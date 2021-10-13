package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Circle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

public class Main{
    public static void main(String[] args) {
        System.out.println("Task for Java OOP, tests available");

        Calculator calculator = new Calculator();
        Figure[] figures = new Figure[]{new Rectangle(1, 0.9), new Circle(2)};
        System.out.printf("Sum of areas = %.6f",calculator.sumAreas(figures));
    }
}