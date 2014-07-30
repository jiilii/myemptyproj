package com.hyweb;

import com.mysql.jdbc.Driver;

import java.sql.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        test();
    }

    private static void test() throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.jdbc.Driver");
//        DriverManager.registerDriver(new Driver());
        Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.1.63:3306/tmdb","root","1234");

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("select * from t_user");

        while(rs.next()){
            System.out.println(rs.getObject("id") +"\t" +
                    rs.getObject("name") + "\t" +
                    rs.getObject(3) + "\t" +
                    rs.getObject(4) + "\t" +
                    rs.getObject(5));
        }

        rs.close();
        stmt.close();
        conn.close();


    }

}
