package lk.ijse.networking;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_App {
    public static void main(String[] args) {

        try {
            // Create Server Socket
            ServerSocket serverSocket = new ServerSocket(3000); // localhost = 127.0.0.1
            // Accept and Create new socket
            Socket localSocket = serverSocket.accept();

            DataInputStream dataInputStream = new DataInputStream(localSocket.getInputStream());
            String message = dataInputStream.readUTF();
            System.out.println(message);
            localSocket.close();

        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
