package GeometricFigure;

public interface Figure {
    String getBackgroundColor();

    String getBorderColor();

    int getArea();

    int getPerimeter();

    default void printInfo() {
        System.out.println("area: " + getArea()
                + ", perimeter: " + getPerimeter()
                + ", background color: " + getBackgroundColor()
                + ", border color: " + getBorderColor());
    }
}
