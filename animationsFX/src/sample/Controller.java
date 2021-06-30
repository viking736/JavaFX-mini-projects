package sample;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Rectangle myRectangle;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        translate
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(myRectangle);
        translate.setDuration(Duration.millis(1000));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setByX(250);
        translate.setByY(-250);
        translate.setAutoReverse(true);
        translate.play();

//        rotate
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setNode(myRectangle);
        rotateTransition.setDuration(Duration.millis(1000));
        rotateTransition.setCycleCount(RotateTransition.INDEFINITE);
        rotateTransition.setInterpolator(Interpolator.LINEAR);
        rotateTransition.setByAngle(360);
        rotateTransition.setAxis(Rotate.X_AXIS);
        rotateTransition.play();

//        fade
        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setNode(myRectangle);
        fadeTransition.setDuration(Duration.millis(1000));
        fadeTransition.setCycleCount(FadeTransition.INDEFINITE);
        fadeTransition.setInterpolator(Interpolator.LINEAR);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);
        fadeTransition.play();

//        scale
        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.setNode(myRectangle);
        scaleTransition.setDuration(Duration.millis(1000));
        scaleTransition.setCycleCount(ScaleTransition.INDEFINITE);
        scaleTransition.setInterpolator(Interpolator.LINEAR);
        scaleTransition.setByY(2.0);
        scaleTransition.setByX(2.0);
        scaleTransition.setAutoReverse(true);
        scaleTransition.play();
    }
}
