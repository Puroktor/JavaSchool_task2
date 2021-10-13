package ru.dataart.academy.java;

import org.junit.jupiter.api.Test;
import ru.dataart.academy.java.figures.Circle;
import ru.dataart.academy.java.figures.Figure;
import ru.dataart.academy.java.figures.Rectangle;

public class CalculatorTest {
    @Test
    public void test() {
        Calculator calculator = new Calculator();
        final double EPS = 1e-6;

        Figure[] figures = new Figure[]{new Circle(1), new Rectangle(1, 2)};
        assert (Math.abs(calculator.sumAreas(figures) - Math.PI - 2) < EPS);

        figures = new Figure[]{new Circle(2), new Circle(3), new Circle(4)};
        assert (Math.abs(calculator.sumAreas(figures) - 29 * Math.PI) < EPS);

        figures = new Figure[]{new Rectangle(2, 3), new Rectangle(0.5, 1), new Rectangle(4, 3)};
        assert (Math.abs(calculator.sumAreas(figures) - 18.5) < EPS);
    }
}
