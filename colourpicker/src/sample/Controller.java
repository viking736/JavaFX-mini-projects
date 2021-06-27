package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class Controller {

    @FXML
    private ColorPicker colourPicker;
    @FXML
    private AnchorPane anchorPane;

    public void changeColour(ActionEvent actionEvent){
        Color myColor = colourPicker.getValue();
        anchorPane.setBackground(new Background(new BackgroundFill(myColor, null, null)));
    }
}
