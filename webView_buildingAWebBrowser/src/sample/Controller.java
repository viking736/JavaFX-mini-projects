package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField myTextField;
    @FXML
    private Button buttonLoad;
    @FXML
    private WebView myWebView;

    private WebEngine engine;
    private WebHistory webHistory;
    private String homePage;
    private double webZoom;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        engine = myWebView.getEngine();
        homePage = "www.google.com";
        myTextField.setText(homePage);
        webZoom = 1;
        loadPage();
    }

    public void loadPage(){
//        engine.load("http://www.google.com");
        engine.load("http://" + myTextField.getText());
    }

    public void refreshPage(){
        engine.reload();
    }

    public void zoomIn(){
        myWebView.setZoom(webZoom += 0.25);
    }

    public void zoomOut(){
        myWebView.setZoom(webZoom -= 0.75);
    }

    public void displayHistory(){
        webHistory = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = webHistory.getEntries();

        for (WebHistory.Entry entry : entries){
//            System.out.println(entry);
            System.out.println(entry.getUrl());
        }
    }

    public void back(){
        webHistory = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = webHistory.getEntries();
        webHistory.go(-1);
        myTextField.setText(entries.get(webHistory.getCurrentIndex()).getUrl());
    }

    public void forward(){
        webHistory = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = webHistory.getEntries();
        webHistory.go(1);
        myTextField.setText(entries.get(webHistory.getCurrentIndex()).getUrl());
    }

    public void executeJS(){
        engine.executeScript("window.location = \"https://www.youtube.com\";");
    }
}
