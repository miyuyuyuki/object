package ex.figure2;

class Triangle extends Figure {
    private double height;
    private double base;

    //コンストラクタ
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    //getter
    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }


    public double getArea() {
        return height * base /2;
    }

    @Override
    public String toString() {
        return String.format("三角形 高さ:%.2f 底辺:%.2f 面積:%.2f",
                height, base,getArea());
    }
}
