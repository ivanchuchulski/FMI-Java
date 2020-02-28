public class MyRectangle extends MyShape {
    //member data
    private double height;
    private double width;

    // constructors
    public MyRectangle(double height, double width) {
        setHeight(height);
        setWidth(width);
    }

    public MyRectangle() {
        setHeight(0.0);
        setWidth(0.0);
    }

    // getters and setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void Info() {
        System.out.printf("rectangle with %f height and %f width%n", height, width);
    }
}
