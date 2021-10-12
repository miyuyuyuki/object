package basic.figure3;

public class FigureSample {
    public static void main(String[] args) {
        //インスタンスの作成
        IfGetArea[] figures = {
                new Rectangle(10,20),
                new Triangle(10,20),
                new Circle(10)
        };

        for(IfGetArea figure:figures) {
            System.out.println(figure.getArea());
        }
    }
}
