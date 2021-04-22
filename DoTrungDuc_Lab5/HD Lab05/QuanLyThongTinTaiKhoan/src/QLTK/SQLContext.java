/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLTK;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author HuyCuong
 */
public class SQLContext {
    
    public Connection GetConnection() throws Exception
    {
        
        String userName ="sa";  
        String password = "123456";
        String dbURL = "jdbc:sqlserver://localhost:1432;databaseName=QLAccount;";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = java.sql.DriverManager.getConnection(dbURL, userName,password);
        return conn;
    }
    public ResultSet ExcuteQuery(String query) throws Exception 
    {  
        Statement statement = GetConnection().createStatement();
        return statement.executeQuery(query);
    }
       
    public void ExcuteUpdate(String sql) throws Exception
    {
        Statement statement = GetConnection().createStatement();
        statement.executeUpdate(sql);
    }
}
