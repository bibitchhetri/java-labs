import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
  public static void main(String[] args) {
    try {
      ServerSocket serverSocket = new ServerSocket(1234);
      System.out.println("Server started at port 1234");

      Socket socket = serverSocket.accept();
      System.out.println("Client connected");

      DataInputStream inputStream = new DataInputStream(socket.getInputStream());
      String message = inputStream.readUTF();
      System.out.println("Message from client: " + message);

      DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
      outputStream.writeUTF("Hello");

      socket.close();
      serverSocket.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

