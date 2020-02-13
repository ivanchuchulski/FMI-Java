package Zad1;

public class Rectangle {
    private double width;
    private double height;
    private static String color;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
        Rectangle.color = "yellow";
    }

    public Rectangle(double rectangleWidth, double rectangleHeight) {
        setWidth(rectangleWidth);
        setHeight(rectangleHeight);
        setColor("yellow");
    }

    public void setWidth(double rectangleWidth) {
        if (rectangleWidth < 0.0) {
            this.width = 1.0;
        }
        else {
            this.width = rectangleWidth;
        }
    }

    public void setHeight(double rectangleHeight) {
        if (rectangleHeight < 0.0) {
            this.height = 1.0;
        }
        else {
            this.height = rectangleHeight;
        }
    }

    public void setColor(String color) {
        if (color == null) {
            Rectangle.color = "yellow";
        }
        else {
            Rectangle.color = color;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return getHeight() * getWidth();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }
}
