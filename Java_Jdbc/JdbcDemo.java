package Java_Jdbc;
import java.sql.*;

public class JdbcDemo {
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String userName = "root";
    private static final String password = "HiHoney@9001Ab";

    public static void main(String[] args) {

        // load the driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // create connection
        try {
            Connection con = DriverManager.getConnection(url,userName,password);
            if (con.isClosed()){
                System.out.println("Not connected");
            } else {
                System.out.println("Connected...");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
