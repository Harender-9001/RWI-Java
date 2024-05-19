package Java_Jdbc;

import java.sql.*;

// CRUD operation using prepared statement
public class Crud2 {
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
            Connection connection = DriverManager.getConnection(url,userName,password);
            if (connection.isClosed()) {
                System.out.println("Connection not created");
            } else {
                System.out.println("Connection created");
            }

            // create
            Statement statement = connection.createStatement();

            // insert data in table
            String query = String.format("insert into Student(name, age, marks) values('%s', %d, %f)", "Akash", 22, 83.14);
            int newRow = statement.executeUpdate(query);
            if (newRow>0) {
                System.out.println("Data inserted successfully");
            } else {
                System.out.println("Data not inserted");
            }

            // update the field in table
            String query1 = String.format("update Student set marks = %f where id = %d", 85.14, 7);
            int newRow1 = statement.executeUpdate(query1);
            if (newRow1>0) {
                System.out.println("Field updated successfully");
            } else {
                System.out.println("Field not updated");
            }

            // delete entry from table
            String query2 = "delete from Student where id = 5";
            int newRow2 = statement.executeUpdate(query2);
            if (newRow2>0) {
                System.out.println("Entry deleted successfully");
            } else {
                System.out.println("Entry not deleted");
            }

            // read data from table
            String data = "select * from Student";
            ResultSet resultSet = statement.executeQuery(data);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");
                System.out.println("Id: " + id);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Marks: " + marks);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
