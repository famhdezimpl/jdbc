package jdbc;

import java.sql.*;

public class ConnectHSQL {
    private static final String USERNAME = "dbuser";
    private static final String PASSWORD = "dbpassword";
    private static final String CONN_STRING =
            "jdbc:hsqldb:data/explorecalifornia";

    public static void main(String[] args){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery("SELECT * FROM states");

            rs.last();
            System.out.println("Number of rows : " + rs.getRow());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
