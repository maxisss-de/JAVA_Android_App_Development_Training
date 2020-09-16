/* 
Задание: сделать чат с графическим интерфейсом
Придумать дизайн для своего чата
Видео Вебинара 03.09.2020
JavaFX
подключение
Cмотреть с 1:03 до конца
*/

/* Ответ */

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
