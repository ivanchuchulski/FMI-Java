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
        Scene scene = new Scene(group, 400, 375);

        double sceneWidth = scene.getWidth();
        double sceneHeight = scene.getHeight();

        Line line = new Line(0, 0, sceneWidth, sceneHeight);
        line.setStroke(Color.CRIMSON);
        line.setStrokeWidth(3);

        group.getChildren().add(line);

        line = new Line(0, sceneHeight, sceneWidth, 0);
        line.setStroke(Color.CORAL);
        line.setStrokeWidth(3);

        group.getChildren().add(line);

        primaryStage.setTitle("Drawing Lines!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
