package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    private ImageView imageBulb;
    @FXML
    private Label onOff;
    @FXML
    private CheckBox check;

    Image image1 = new Image(getClass().getResourceAsStream("bulb.png"));
    Image image2 = new Image(getClass().getResourceAsStream("bulb1.png"));

    public void change(ActionEvent actionEvent){
        if (check.isSelected()){
            imageBulb.setImage(image1);
            onOff.setText("ON");
        }else{
            imageBulb.setImage(image2);
            onOff.setText("OFF");
        }
    }

}
