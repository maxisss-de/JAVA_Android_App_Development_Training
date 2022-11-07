package sample;

import javafx.scene.control.TextArea;
import javafx.fxml.FXML;

public class Controller {

    @FXML
    TextArea messageWindow;

    @FXML
    private void send(){
        messageWindow.setText("Hello World!");
    }
}
