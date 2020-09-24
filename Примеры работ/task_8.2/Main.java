// Клиентов подключившихся к чату выводим в столбик в левом окне формы чата
// Не забываем предварительно запустить Сервер и подключить клиента кнопкой "Подключиться" в форме чата.

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Сетевой чат");

        Scene scene = new Scene(root, 400, 300);
        scene.getStylesheets().add(0, "Styles/style1.css");
        primaryStage.setScene(scene);
        ///primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
