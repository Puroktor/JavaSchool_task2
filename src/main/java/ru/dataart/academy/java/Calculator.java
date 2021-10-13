package ru.dataart.academy.java;

import ru.dataart.academy.java.figures.Figure;

public class Calculator {
    public double sumAreas(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            sum += figure.calculateArea();
        }
        return sum;
        // Про Stream API на лекциях не рассказывали, но все равно напишу
        // return Arrays.stream(figures).mapToDouble(Figure::calculateArea).sum();
    }
}
