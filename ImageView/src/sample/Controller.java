package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    // ImageView is a Node used for painting images loaded with Images
    // Image = photograph
    // ImageView = picture frame
    @FXML
    ImageView imageView;
    @FXML
    Button button1;
    Image image = new Image(getClass().getResourceAsStream("dog1.png"));

    public void displayImage(){
        imageView.setImage(image);
    }

}
