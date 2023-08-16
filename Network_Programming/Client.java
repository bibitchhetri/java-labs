import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
  public static void main(String[] args) {
    try {
      Socket socket = new Socket("localhost", 1234);
      System.out.println("Connected to server");

      DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
      outputStream.writeUTF("Hello");

      DataInputStream inputStream = new DataInputStream(socket.getInputStream());
      String message = inputStream.readUTF();
      System.out.println("Message from server: " + message);

      socket.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

 
