package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {

    @FXML
    Label name;

    public void displayName(String userName){
        name.setText("Hello: " + userName);
    }

}
