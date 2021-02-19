package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static final String DB_USER = "dbuser";
    private static final String DB_PASSWORD = "dbpassword";
    private static final String CONN_STRING = "" +
            "jdbc:mysql://localhost/explorecalifornia";

    public static void main(String[] args) {

        Connection conn = null;

        try{
            conn = DriverManager.getConnection(CONN_STRING, DB_USER, DB_PASSWORD);
            System.out.println("Connected!");
        } catch (SQLException e){
            System.err.println(e);
        }
    }
}
