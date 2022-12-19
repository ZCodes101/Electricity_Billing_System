package Electricity;

import java.sql.*;

public class Conn {
    Connection c = null;
    Statement s = null;
    final String DB_URL = "jdbc:mysql:///ebs";
    final String USERNAME = "root";
    final String PASSWORD = "";

    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Connection was successful");


            s =c.createStatement();


        }catch(Exception e){
            System.out.println(e);
        }
    }
}