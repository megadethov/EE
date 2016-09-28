/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mega.webapp.db;

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author mega
 */
public class Database {
    private static Connection conn;
    private static InitialContext ic;
    private static DataSource ds;
    
    public static Connection getConnection() {
        try {
            ic = new InitialContext();
            ds = (DataSource) ic.lookup("jdbc/Library");
            if(conn == null) {
                conn = ds.getConnection();                
            }
        } catch (SQLException ex) {
           System.out.println("ОШИБКА Database.java");
        } catch (NamingException ex2) {
            System.out.println("ОШИБКА Database2.java");
        }
        return conn;
    }
}
