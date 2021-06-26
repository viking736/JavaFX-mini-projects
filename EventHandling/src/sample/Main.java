package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.setFullScreen(true);
        primaryStage.setFullScreenExitHint("Press q to exit full screen");
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
