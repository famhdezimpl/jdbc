package jdbc;

import java.sql.*;

public class Main {

    public static void main(String[] args){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs =  null;

        try{
            conn = DBUtil.getConnection(DBType.HSQLDB);
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery("SELECT * FROM states");

            rs.last();
            System.out.println("number of rows : " + rs.getRow());
        } catch (SQLException e){
            System.err.println(e);
        }
    }
}
