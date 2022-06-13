import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(new Trapeze(2, 4, 3, 2));
        figures.add(new Triangle(4));
        figures.add(new Circle("circle", 3));
        figures.add(new Square("square", 8));


        for (int i = 0; i < figures.size(); i++) {
            System.out.println(figures.get(i).showInfo());

        }
    }
}





