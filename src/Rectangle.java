public class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle() {
        height = 1.0;
        width = 1.0;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public double computePerimeter() {
        return 2 * height + 2 * width;
    }

    @Override
    public double computeArea() {
        return height * width;
    }
}
