package lk.ijse.networking;

import java.io.DataOutputStream;
import java.net.Socket;

public class Client_App {
    public static void main(String[] args) {

        try {
            Socket remoteSocket = new Socket("localhost",3000); // localhost = "127.0.0.1",3000

            DataOutputStream dataOutputStream = new DataOutputStream(remoteSocket.getOutputStream());
            dataOutputStream.writeUTF("Hello I am a Client");
            dataOutputStream.flush();
            dataOutputStream.close();
            remoteSocket.close();

        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
