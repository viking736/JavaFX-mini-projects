package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1Controller {

    @FXML
    TextField textFieldName;
    Button buttonLogin;

    private Parent root;
    private Stage stage;
    private Scene scene;

    public void login(ActionEvent actionEvent) throws IOException{

        String userName = textFieldName.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
        root = loader.load();
        Scene2Controller scene2Controller = loader.getController();

        if (!userName.isEmpty()){
            scene2Controller.displayName(userName);
        }else{
            System.out.println("ERROR");
        }

        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        scene = new Scene(root, 300, 275);
        stage.setScene(scene);
        stage.show();
    }
}
