import java.util.Random;

public class Generator {

    private static final int FIGURE_LIMIT = 4;
    private static final int VALUE_LIMIT = 20;


    public static Figure randomGenerator() {
        Random number = new Random();
        int randomFigure = number.nextInt(4);
        switch (randomFigure) {
            case 0:
                return new Circle("Circle", (double) number.nextInt(20));
            case 1:
                return new Trapeze("Trapeze", (double) number.nextInt(20),
                        (double) number.nextInt(20),
                        (double) number.nextInt(20), (double) number.nextInt(20));
            case 2:
                return new Triangle("Triangle", number.nextInt(20), number.nextInt(20),
                        number.nextInt(20));
            case 3:
                return new Square("Square", (double) number.nextInt(20));
            default:
                return null;
        }
    }
}
