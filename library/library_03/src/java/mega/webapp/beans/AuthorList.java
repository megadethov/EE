/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mega.webapp.beans;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mega.webapp.db.Database;

/**
 *
 * @author mega
 */
public class AuthorList {
    private ArrayList<Author> authorList = new ArrayList<>();
    
    // getter поля authorList
    private ArrayList<Author> getAuthors() {
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;
        try{
            conn = Database.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from author");
            while (rs.next()) {
                Author author = new Author();
                author.setName(rs.getString("fio"));
                authorList.add(author);
            }            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (rs != null) rs.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                // NOP
            }
        }
        return authorList;
    }
    
    public ArrayList<Author> getAuthorList() {
        if(!authorList.isEmpty()) {
            return authorList;
        } else {
            return getAuthors();
        }
    }
}
