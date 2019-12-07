package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // creating the layout panel and the scene
        Group group = new Group();
        Scene scene = new Scene(group, 400, 400);

        double sceneWidth = scene.getWidth();
        double sceneHeight = scene.getHeight();

        // drawing fanning lines clockwise, where origin points start at top left corner
        double xOrigin = 0.0;
        double yOrigin = 0.0;

        int numberOfLines = 20;

        int xStep = (int)sceneWidth / numberOfLines;
        int yStep = (int)sceneHeight / numberOfLines;

        // bottom left to to top right
        for (int i = 0; i < numberOfLines; i++) {
            Line line = new Line(xOrigin, yOrigin,  xOrigin + i * xStep, sceneHeight - i * yStep);
            line.setStroke(Color.RED);
            line.setStrokeWidth(2);

            group.getChildren().add(line);
        }

        // top left to bottom right
        for (int i = 0; i < numberOfLines; i++) {
            Line line = new Line(sceneWidth, yOrigin, xOrigin + i * xStep, yOrigin + i * yStep);
            line.setStroke(Color.BLUE);
            line.setStrokeWidth(2);

            group.getChildren().add(line);
        }

        // top right to bottom left
        for (int i = 0; i < numberOfLines; i++) {
            Line line = new Line(sceneWidth, sceneHeight, sceneWidth - i * xStep, yOrigin + i * yStep);
            line.setStroke(Color.GREEN);
            line.setStrokeWidth(2);

            group.getChildren().add(line);
        }

        // bottom right to top left
        for (int i = 0; i < numberOfLines; i++) {
            Line line = new Line(xOrigin, sceneHeight, sceneWidth - i *  xStep, sceneWidth - i * yStep);
            line.setStroke(Color.YELLOW);
            line.setStrokeWidth(2);

            group.getChildren().add(line);
        }

        primaryStage.setTitle("Drawing Lines!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
