package basic.figure1;

public class FigureSample {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,20);
        System.out.println(r1);
        //長方形 高さ:10.00 幅:20.00 面積:200.00

        Triangle t1 = new Triangle(10,20);
        System.out.println(t1);
        //三角形 高さ:10.00 底辺:20.00 面積:100.00

        Circle c1 = new Circle(10);
        System.out.println(c1);
        //円形 半径:10.00 面積:314.16
    }
}
