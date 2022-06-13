public class Square extends Figure {

    private double a;

    public Square(String square, double a) {
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
        String result = "Фигура: квадрат, площадь: " + area() + "ед.кв. Цвет " + colour() + ".";
        return result;
    }

    // @Override
    // public int randomN() {
    // int randomN = (int) (Math.random() * 10 + 1);
    // return randomN;
    // }
    //
}
