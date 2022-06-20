package src;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(double size) {
        this.a = size;
        this.b = size;
        this.c = size;
    }

    public double perimeter() {
        return (a + b + c) / 2;
    }

    @Override
    public double area() {
        double s = perimeter() * ((perimeter() - a) * (perimeter() - b) * (perimeter() - c));
        return Math.sqrt(s);
    }

    @Override
    public String colour() {
        return "голубой";
    }

    @Override
    public String showInfo() {
        return "Фигура: треугольник, площадь: " + area() + "ед.кв. Периметр = " + perimeter() + ". Цвет: " +
                colour() + ".";
    }
}
