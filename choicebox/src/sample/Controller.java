package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label myLabel;

    @FXML
    private ChoiceBox<String> myChoicebox;

    private String[] food = new String[]{"pizza", "hamburger", "spaghetti", "rice", "French fries"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myChoicebox.getItems().addAll(food);
        myChoicebox.setOnAction(this::getFood);
    }

    public void getFood(ActionEvent actionEvent){
        String myFood = myChoicebox.getValue();
        myLabel.setText(myFood);
    }
}
