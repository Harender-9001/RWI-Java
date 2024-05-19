package Java_Jdbc;

import java.sql.*;

// CRUD operation using simple statement
public class Crud {

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

            // insert data in table
            String query = "INSERT INTO student(name, age, marks) VALUES(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "Harry");
            preparedStatement.setInt(2, 25);
            preparedStatement.setDouble(3, 82.32);
            int newRow = preparedStatement.executeUpdate();
            if (newRow>0) {
                System.out.println("Data inserted successfully");
            } else {
                System.out.println("Data not inserted");
            }

            // update the field in table
            query = "UPDATE student SET marks = ? WHERE id = ?";
            PreparedStatement preparedStatement1 = connection.prepareStatement(query);
            preparedStatement1.setDouble(1, 86.45 );
            preparedStatement1.setInt(2, 6);
            int newRow1 = preparedStatement1.executeUpdate();
            if (newRow1>0) {
                System.out.println("Field updated successfully");
            } else {
                System.out.println("Field not updated");
            }

            // delete entry from table
            query = "DELETE FROM student WHERE id = ?";
            PreparedStatement preparedStatement3 = connection.prepareStatement(query);
            preparedStatement3.setInt(1, 7);
            int newRow2 = preparedStatement3.executeUpdate();
            if (newRow2>0) {
                System.out.println("Entry deleted successfully");
            } else {
                System.out.println("Entry not deleted");
            }

            // read data from table
            query = "select * from Student";
            PreparedStatement preparedStatement4 = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement4.executeQuery();
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
