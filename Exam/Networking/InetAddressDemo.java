import java.net.*;

public class InetAddressDemo {
  public static void main(String[] args) throws UnknownHostException {
    InetAddress address = InetAddress.getByName("www.example.com");
    System.out.println("IP address: " + address.getHostAddress());
  }
}
