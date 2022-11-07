// ------------------------------------------------------------------------
/* 
Задание: 
Сделать чат
*/
// ------------------------------------------------------------------------

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.io.IOException;
import java.util.ArrayList;
import jdk.net.Sockets;
import java.net.Socket;
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
    public static void main(String[] args) {
        final String[] color = new String[] {"\u001B[0m", "\u001B[30m", "\u001B[31m", "\u001B[32m", "\u001B[33m", "\u001B[34m", "\u001B[35m", "\u001B[36m", "\u001B[37m"};
        
        Socket socket = null;
        try {
            ServerSocket serverSocket = new ServerSocket(8190);
            Date date = new Date();
            System.out.println("В " + color[2] + "(" + date + ")" + color[0] + " - Сервер запущен");
            while (true){
                socket = serverSocket.accept();

                clients.add(socket); 
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                out.writeUTF("Укажите ваше Имя - ");
                String name = in.readUTF();

                Date date1 = new Date();
                System.out.println(color[0] + "В (" + date1 + ")  - Клиент " + name + " подключился к чату");

                out.writeUTF("Ваше Имя - "+ name); 

                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            while (true){
                                String str = in.readUTF();
                                Date date2 = new Date();
                                System.out.println(color[4] + "Клиент "+ name + " в (" + date2 + ") прислал(-а) сообщение: "+color[2]+ str);
                                str=name + " в (" + date2 + ") : " +str;
                                broadcastMsg(str);
                            }
                        }catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
                thread.start();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void broadcastMsg(String str) throws IOException {
        DataOutputStream out;
        for (Socket socket : clients){
            out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF(str);
        }
    }
}
