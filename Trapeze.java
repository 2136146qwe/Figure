
public class Trapeze extends Figure {
    private double a;
    private double b;
    private double c;
    private double d;

    public Trapeze(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double high() {
        double x = c * c;
        double y = d * d;
        double m = a - b;
        double v = ((m * m) + x - y) / (2 * m);
        double h = Math.sqrt(x - v * v);
        return h;
    }

    @Override
    public double area() {
        double s = (a + b) / 2 * high();
        return s;
    }

    @Override
    public String colour() {
        return "зеленый";
    }

    @Override
    public String showInfo() {
        String result = "Фигура: трапеция, площадь: " + area() + "ед.кв. Высота =  " + high() + ". Цвет: " + colour() +
                ".";
        return result;
    }
}

