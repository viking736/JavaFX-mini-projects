package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label welcome;
    @FXML
    private TextField ageTextField;
    @FXML
    private Button submitButton;

    int age;

    public void submit(ActionEvent actionEvent){
        try {
            age = Integer.parseInt(ageTextField.getText());
            if (age >= 18){
                welcome.setText("Successfully signed up!");
            }else{
                welcome.setText("Sorry, you are too young to sign up");
            }
        }catch (NumberFormatException e){
            welcome.setText("Enter only numbers please");
        }
        catch (Exception e){
            welcome.setText("ERROR");
        }
    }


}
