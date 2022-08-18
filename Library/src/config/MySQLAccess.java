package config;

import java.sql.*;

public class MySQLAccess {
    private static Connection connect = null;
    private static Statement statement = null;
    private static ResultSet resultSet = null;


    private static Connection connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "12345678");

        } catch (Exception e) {
            System.out.println(e);
            return null;

        }
    }


    //Create
    public void creatQuery(String query) throws SQLException {
        try (Connection connect = MySQLAccess.connection()) {
            if (connect != null) {
                Statement sqlQuery = connect.createStatement();
                sqlQuery.executeUpdate(query);
            }
        } finally {
            close();
        }
    }

    //Insert,Update,Delete,Select
    public ResultSet SQLQuery(String query) throws SQLException {
        Connection connect=MySQLAccess.connection();
            if (connect != null) {
                Statement sqlQuery = connect.createStatement();
                return sqlQuery.executeQuery(query);
            }
        return null;
    }


    // You need to close the resultSet
    public static void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }
    }
}
