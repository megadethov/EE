/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author mega
 */
public class TestConnection {
    public void check() {
        try {
            InitialContext ic = new InitialContext();
//            DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/Library"); // original
            DataSource ds = (DataSource) ic.lookup("jdbc/Library");  // new variant
            
            Connection conn = ds.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM book");
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
            System.out.println("TEST TEST TEST");
            
        } catch (NamingException ex) {
            Logger.getLogger(TestConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TestConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
