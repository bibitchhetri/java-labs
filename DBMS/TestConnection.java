import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class JDBCDemo {
  public static void main(String[] args) {
    String Url="jdbc:mysql://localhost:3306/jabcdemo";
    String Username="root";
    String Password="root";
    try {
      Class.forName ("com.mysql.cj.jdbc.Driver");
      Connection connection= DriverManager.getConnection(Url,Username,Password);
      Statement statement=connection.createStatement();
      ResultSet resultSet=statement.executeQuery("select * from student");
      while (resultSet.next())
        System.out.println(resultSet.getInt(1) +" "+ resultSet.getString(2) + resultSet.getInt(3));
    } 
    catch (Exception e)
      System.out.println(e);
  }
}

