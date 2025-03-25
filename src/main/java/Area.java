package simpleCode;

public class Area {
    private double area;

    public double getArea() {
        return area;
    }

    public void areaCircle(double radius) {
        area = Math.PI * Math.pow(radius, 2);
    }

    public void areaRectangle(double width, double height) {
        area = width * height;
    }

    public void areaSquare(double side) {
        area = side * side;
    }

    public void areaTriangle(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double x = s * (s - a) * (s - b) * (s - c);
        area = Math.sqrt(x);
    }
}
