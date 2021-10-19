package ex.figure2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FigureSample {
    public static void main(String[] args) {
        Figure[] figures = {
                new Rectangle(10,20),
                new Triangle(10,20),
                new Circle(10)
        };

        for(Figure figure:figures) {
            System.out.println(figure);
        }

        Rectangle r1 = new Rectangle(10,20);
        System.out.println(r1);

        Triangle t1 = new Triangle(10,20);
        System.out.println(t1);

        Circle c1 = new Circle(10);
        System.out.println(c1);


        //インスタンスの作成
        //ArrayListで宣言
        List<Figure> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new Rectangle(10,20),
                new Triangle(20,15),
                new Circle(10)
        ));

        //
        for(Figure figure:figures) {
            System.out.println(figure);
        }

    }
}
