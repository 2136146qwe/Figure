package src;

public class Square extends Figure {

    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public String colour() {
        return "красный";

    }

    @Override
    public String showInfo() {
        return "Фигура: квадрат, площадь: " + area() + "ед.кв. Цвет " + colour() + ".";
    }
}
