package src;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList();

        for (int i = 0; i < 15; ++i) {
            figures.add(Generator.randomGenerator());
        }

        for (Figure figure : figures) {
            System.out.println(figure.showInfo());
        }
    }
}




