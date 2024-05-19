package Java_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchDemo {
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
            Connection connection = DriverManager.getConnection(url, userName, password);
            if (connection.isClosed()) {
                System.out.println("Connection not created");
            } else {
                System.out.println("Connection created");
            }

            // insert data in table
            String query = "INSERT INTO Student(name, age, marks) VALUES(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                System.out.print("Enter marks: ");
                double marks = scanner.nextDouble();
                System.out.print("Want to enter more data(Y/N): ");
                String choice = scanner.next();
                preparedStatement.setString(1, name);
                preparedStatement.setInt(2, age);
                preparedStatement.setDouble(3, marks);

                preparedStatement.addBatch();
                if (choice.equalsIgnoreCase("N")) {
                    break;
                }
            }

            int[] arr = preparedStatement.executeBatch();

            for (int i=0;i<arr.length;i++) {
                if (arr[i] == 0) {
                    System.out.println("Query:" +i+ "not executed successfully");
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
