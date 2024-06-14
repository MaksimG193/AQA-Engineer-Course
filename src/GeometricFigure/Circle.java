package GeometricFigure;

public class Circle extends AbstructFigure {

    private final double radius;

    public Circle(String backgroundColor, String borderColor, int radius) {
        super(backgroundColor, borderColor);
        this.radius = radius;
    }
    @Override
    public int getArea() {
        return (int) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * radius);
    }
}
