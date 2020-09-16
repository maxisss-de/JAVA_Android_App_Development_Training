/* 
Задание: сделать чат с графическим интерфейсом
Придумать дизайн для своего чата
Видео Вебинара 03.09.2020
JavaFX
подключение
Cмотреть с 1:03 до конца
*/

/* В разработке */


package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;



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
