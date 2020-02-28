import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyShape> shapes = new ArrayList<>();

        shapes.add(new MyRectangle());
        shapes.add(new MySquare());

        for (MyShape shape : shapes) {
            shape.Info();
        }
        
    }

}
