//package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",8190);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            Thread responseThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        String response = null;
                        try {
                            response = in.readUTF();
                            System.out.println(response); // - Печатаем в окно клиента ответы других участников чата?
                        } catch (IOException exception) {
                            exception.printStackTrace();
                        }
                    }
                }
            });
            responseThread.start(); // - Запуск в работу ответного многпоточного метода отображающего сообщения пользователей в окно клиента
            while (true){
                String str = scanner.nextLine();
                out.writeUTF(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
