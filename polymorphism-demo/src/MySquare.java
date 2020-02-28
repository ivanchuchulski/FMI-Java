public class MySquare extends MyShape {
    private double side;

    public MySquare(double side) {
        setSide(side);
    }

    public MySquare() {
        setSide(0.0);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public void Info() {
        System.out.printf("square with %f side%n", side);
    }
}
