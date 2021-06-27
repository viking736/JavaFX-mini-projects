package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Controller {

    @FXML
    private Label date;
    @FXML
    private DatePicker datePicker;


    public void getDate(ActionEvent actionEvent){
        LocalDate myDate = datePicker.getValue();
        String myFormatDate = myDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        date.setText(myFormatDate);
    }


}
