package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Controller {

    @FXML
    private Label food;
    @FXML
    private RadioButton spaghettiButton;
    @FXML
    private RadioButton pizzaButton;
    @FXML
    private RadioButton ravioliButton;


    public void choose(ActionEvent actionEvent){
        if (spaghettiButton.isSelected()){
            food.setText(spaghettiButton.getText());
        }else if (pizzaButton.isSelected()){
            food.setText(pizzaButton.getText());
        }else if (ravioliButton.isSelected()){
            food.setText(ravioliButton.getText());
        }
    }
}
