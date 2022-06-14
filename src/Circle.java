public class Circle extends Figure {
    private double a;
    private static final double PI = 3.14;

    public Circle(String circle, double a) {
        this.a = a;
    }

    public double radius() {
        return (a / 2);
    }

    @Override
    public double area() {
        return (radius() * radius()) * PI;
    }

    @Override
    public String colour() {
        return "оранжевый";
    }

    @Override
    public String showInfo() {
        String result = "Фигура: круг, площадь: " + area() + "ед.кв. " + " Радиус = " + radius() + ". Цвет: " +
                colour() + ".";
        return result;

    }
}

