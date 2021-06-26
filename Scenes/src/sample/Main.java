package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.DARKGREEN);
        Stage stage = new Stage();

        Text text = new Text();
        text.setText("Hello World!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Bold", 25));
        text.setFill(Color.WHITE);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.WHITE);
        line.setOpacity(0.5);
        line.setRotate(45);
        
        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.RED);
        rectangle.setOpacity(0.6);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLUE);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(200.0, 200.0,
                300.0, 300.0, 200.0, 300.0);
        triangle.setFill(Color.YELLOW);

        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);

        Image icon = new Image("picture.png");
        ImageView imageView = new ImageView(icon);
        imageView.setX(500);
        imageView.setY(500);

        root.getChildren().add(imageView);
        root.getChildren().add(circle);
        root.getChildren().add(triangle);
        root.getChildren().add(rectangle);
        root.getChildren().add(line);
        root.getChildren().add(text);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("y"));
        stage.setFullScreenExitHint("Press y to exit the full screen if you wanna do it");
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
