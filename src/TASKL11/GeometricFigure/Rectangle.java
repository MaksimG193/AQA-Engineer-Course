package GeometricFigure;

public class Rectangle extends AbstructFigure{

    private final int length;
    private final int height;

    public Rectangle(String backgroundColor, String borderColor, int length, int height) {
        super (backgroundColor, borderColor);
        this.length = length;
        this.height = height;
    }
    @Override
    public int getArea() {
        return length * height;
    }

    @Override
    public int getPerimeter() {
        return 2 * (length + height);
    }
}
