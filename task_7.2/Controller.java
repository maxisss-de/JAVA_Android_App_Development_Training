// ------------------------------------------------------------------------
/* 
Задание: 
Сделать чат с графическим интерфейсом
Придумать дизайн для своего чата
(Видео Вебинара 03.09.2020 смотреть с 01:03 до конца)
JavaFX
подключение
*/
// ------------------------------------------------------------------------

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
