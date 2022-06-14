 import java.util.ArrayList;
import java.util.Iterator;

    public class Main {

        public static void main(String[] args) {
            ArrayList<Figure> figures = new ArrayList();

            for(int i = 0; i < 10; ++i) {
                figures.add(Generator.randomGenerator());
            }

            Iterator<Figure> iterator1 = figures.iterator();

            while(iterator1.hasNext()) {
                Figure object = iterator1.next();
                Iterator<Figure> iterator2 = figures.iterator();

                while(iterator2.hasNext()) {
                    Figure figure = iterator2.next();
                    object.showInfo();
                }
            }

        }
    }




