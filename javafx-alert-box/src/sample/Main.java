package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.util.Optional;

public class Main extends Application {
    private static Alert alert = new Alert(Alert.AlertType.INFORMATION);
    private static TextInputDialog dialog = new TextInputDialog();

    private void messageDialog(String infoMessage, String titleBar, String headerMessage) {
        alert.setTitle(titleBar);
        alert.setHeaderText(headerMessage);
        alert.setContentText(infoMessage);

        alert.showAndWait();
    }

    public String inputDialog(String infoMessage, String titleBar, String headerMessage) {
        dialog.setTitle(titleBar);
        dialog.setHeaderText(headerMessage);
        dialog.setContentText(infoMessage);

        Optional<String> result = dialog.showAndWait();

        if (result.isEmpty()) {
            return "default value";
        }
        else {
            return result.get();
        }

    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        String username = inputDialog("enter your name", "user input", null);

        String message = String.format("javafx boxes, %s", username);

        messageDialog(message, "information alert box", "reply");

        Platform.exit();
    }

    public static void main(String[] args) {
        launch(args);
    }
}