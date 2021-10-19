package ex.figure2;

class Circle extends Figure {
    //
    private  double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return String.format("円形 半径:%.2f 面積:%.2f",
                radius,getArea());
    }
}
