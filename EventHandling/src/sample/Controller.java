package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private Circle circle;
    private double x;
    private double y;

    public void up(ActionEvent actionEvent){
        circle.setCenterY(y-=10);
        circle.setFill(Color.RED);
    }
    public void down(ActionEvent actionEvent){
        circle.setCenterY(y+=10);
        circle.setFill(Color.DARKGREEN);
    }
    public void right(ActionEvent actionEvent){
        circle.setCenterX(x+=10);
        circle.setFill(Color.LIGHTSKYBLUE);
    }
    public void left(ActionEvent actionEvent){
        circle.setCenterX(x-=10);
        circle.setFill(Color.CRIMSON);
    }
}
