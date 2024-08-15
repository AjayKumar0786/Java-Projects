/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
/**
 *
 * @author ranu kumar
 */
public class ConnectionProvider {
    public static Connection getCon()
    
    {
        try
        {
        Class.forName("com.Postgresql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:Postgresql://localhost:3306/project","root","123456");
        return con;
        }
        catch(Exception e)
        {
        return null;
        }
    }
    }

