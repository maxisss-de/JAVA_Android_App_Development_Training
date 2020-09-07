/* 
Задание: подключаем ip двумя способами, один через Run второй через Аноним
*/

/* Ответ */


import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.Arrays;

public class ProxyChecker {
    public static void main(String[] args) throws Exception {
        System.out.println("Сканирования Прокси-серверов на предмет их доступности.");
        System.out.println("Данные прокси-серверов будут считываться с файла C:/Program Files/java/ip.txt");
        System.out.println("Читаем файл с адресами");
        FileReader reader = new FileReader("C:/Program Files/java/ip.txt");
        int c;
        String ipList = "";
        while ((c=reader.read())!=-1){
            ipList += (char)c;
        }
        String[] ipListArray = ipList.split("\r");
        for (int i = 0; i < ipListArray.length; i++) {
            String[] splitString = ipListArray[i].split(":");
            String ip = splitString[0].trim();
            int port = Integer.parseInt(splitString[1]);
            Thread t1 = new Thread(new MyRunnableClass(ip,port,i));
            t1.start();
        }
    }
}

class MyRunnableClass implements Runnable{
    String ip;
    int port;
    int i;
    public MyRunnableClass(String ip, int port, int i) {
        this.ip = ip;
        this.port = port;
        this.i = i;
    }
    @Override
    public void run(){
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
        try {
            URLConnection connection = new URL("https://vozhzhaev.ru/test.php").openConnection(proxy);
            InputStream is = connection.getInputStream();
            InputStreamReader reader = new InputStreamReader(is);
            char[] buffer = new char[256];
            int rc;
            StringBuilder sb = new StringBuilder();
            while ((rc = reader.read(buffer)) != -1)
                sb.append(buffer, 0, rc);
            reader.close();
            System.out.println("Поток - "+i+" - ip: "+ip+":"+port+" - РАБОТАЕТ");
        }catch (Exception e){
            System.out.println("Поток - "+i+" - ip: "+ip+":"+port+" - не работает");
        }
    }
}
