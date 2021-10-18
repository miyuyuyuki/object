package ex.figure2;

class Rectangle extends Figure {
    //フィールド
    private double height;
    private double width;

    //コンストラクタ
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    //getter
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    /**
     * 面積を求める getArea()
     * @return double 図形の面積
     */
    public double getArea() {
        return height * width;
    }

    @Override
    public String toString() {
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...)
        //https://java-code.jp/173
        return String.format("長方形 高さ:%.2f 幅:%.2f 面積:%.2f",
                height, width,getArea());
    }

}
