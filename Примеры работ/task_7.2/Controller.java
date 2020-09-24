package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;



public class Controller {


    @FXML
    TextArea messageWindow;

    @FXML
    private void send(){
        messageWindow.setText("Hello World!");
    }
}
