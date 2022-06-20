package src;

import java.util.Random;

public class Generator {

    private static final int FIGURE_LIMIT = 4;
    private static final int VALUE_LIMIT = 40;


    public static Figure randomGenerator() {
        Random number = new Random();
        int randomFigure = number.nextInt(FIGURE_LIMIT);
        switch (randomFigure) {
            case 0:
                return new Circle(number.nextInt(VALUE_LIMIT));
            case 1:
                return new Trapeze(number.nextInt(VALUE_LIMIT),
                        number.nextInt(VALUE_LIMIT),
                        number.nextInt(VALUE_LIMIT), number.nextInt(VALUE_LIMIT));
            case 2:
                return new Triangle(number.nextInt(VALUE_LIMIT), number.nextInt(VALUE_LIMIT),
                        number.nextInt(VALUE_LIMIT));
            case 3:
                return new Square(number.nextInt(VALUE_LIMIT));
            default:
                return null;
        }
    }
}
