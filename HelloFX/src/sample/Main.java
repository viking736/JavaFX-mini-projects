package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root, Color.LIGHTSKYBLUE);
        stage.setScene(scene);
        Image icon = new Image("kiity.png");
        stage.getIcons().add(icon);
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setResizable(false);
        stage.setX(550);
        stage.setY(150);
        stage.setFullScreen(true);
        stage.setFullScreenExitHint("Press t if you would like some tea");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("t"));
        stage.setTitle("Hello There!");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
