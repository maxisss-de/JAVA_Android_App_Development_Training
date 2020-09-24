// package server;
import jdk.net.Sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class ClientsClass {
    public Socket socket;
    public String name;
    public String color;

    public ClientsClass (Socket socket, String name, String color) {
        this.socket = socket;
        this.name = name;
        this.color = color;
    }
}

public class Server {

    static ArrayList<Socket> clients = new ArrayList<>();
    //static ArrayList<ClientsClass> clientsCL = new ArrayList<>();
    //static List<String> clientscolor = new ArrayList<>();
    //static List<String> clientsName = new ArrayList<>();
    public static void main(String[] args) {
        final String[] color = new String[] {"\u001B[0m", "\u001B[30m", "\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m", "\u001B[36m", "\u001B[37m"};

//        final String ANSI_RESET = "\u001B[0m"; //        final String ANSI_BLACK = "\u001B[30m"; //        final String ANSI_RED = "\u001B[31m";
//        final String ANSI_GREEN = "\u001B[32m";//        final String ANSI_YELLOW = "\u001B[33m";//        final String ANSI_BLUE = "\u001B[34m";
//        final String ANSI_PURPLE = "\u001B[35m";//        final String ANSI_CYAN = "\u001B[36m";//        final String ANSI_WHITE = "\u001B[37m";

        Socket socket = null;
        try {
            ServerSocket serverSocket = new ServerSocket(8190);
            Date date = new Date();
            System.out.println("В " + color[2] + "(" + date + ")" + color[0] + " - Сервер запущен");
            while (true){
                socket = serverSocket.accept();   // - Подключаем нового клиента
                //ClientsClass clientCL = new ClientsClass(socket,"Name", color[4]); // - Конструктор нового клиента

                clients.add(socket);              // - Добавляем нового клиента в список текущих клиентов
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                out.writeUTF("Укажите ваше Имя - ");
                String name = in.readUTF();

                Date date1 = new Date();          // - Время подключения клиента
                System.out.println(color[0] + "В (" + date1 + ")  - Клиент " + name + " подключился к чату"); // - Выводим сообщение в консоль сервера о подключении нового клиента с указанием времени подключенния

                //clientCL.name = in.readUTF();
                //clientsName.add(in.readUTF());
                //out.writeUTF("Ваше Имя - "+ clientsName[0]);
                out.writeUTF("Ваше Имя - "+ name); // clients.size?   clienytCL.get(3);

                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            while (true){
                                String str = in.readUTF(); // - считываем входящий поток (пришедшее сообщение от одного из клиентов)
                                 // - Пересылаем принятое от одного из клиентов сообщение всем остальным пользователям
                                Date date2 = new Date();
                                System.out.println(color[4] + "Клиент "+ name + " в (" + date2 + ") прислал(-а) сообщение: "+color[2]+ str); // - Выводим сообщение клиента в консоль сервера
                                str=name + " в (" + date2 + ") : " +str;
                                broadcastMsg(str);
                            }
                        }catch (IOException e){
                            e.printStackTrace();
                        }
                    }
                });
                thread.start();
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static void broadcastMsg(String str) throws IOException { // - Метод рассылки сообщений всем клиентам с сервера ,
        // аргумент - строка для рассылки
            DataOutputStream out;
            for (Socket socket : clients){
                out = new DataOutputStream(socket.getOutputStream());
                out.writeUTF(str);
            }
        }
    }
