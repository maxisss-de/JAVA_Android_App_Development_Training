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

import javafx.application.Application;
import javafx.scene.control.TextArea;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 400, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
