/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mega.webapp.beans;

/**
 *
 * @author mega
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import mega.webapp.db.Database;

public class BookList {

    private ArrayList<Book> bookList = new ArrayList<Book>();

    private ArrayList<Book> getBooks(String str) {
        
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
       
        try {
            System.out.println("1");
            conn = Database.getConnection();
            System.out.println("2");
            
            try {
                stmt = conn.createStatement();
            } catch (NullPointerException ex2) {
                System.err.println("Null Pointer ---->>>> stmt = conn.createStatement()");
            } catch (Exception ex3) {
                System.err.println("????????????????????????????");
            }
            
            System.out.println("3");
            System.out.println(str);
            System.out.println("4");
            rs = stmt.executeQuery(str);
            System.out.println("5");
            while (rs.next()) {
                System.out.println("6");
                Book book = new Book();
                book.setId(rs.getLong("id"));
                book.setName(rs.getString("name"));
                book.setGenre(rs.getString("genre"));
                book.setIsbn(rs.getString("isbn"));
                book.setAuthor(rs.getString("author"));
                book.setPageCount(rs.getInt("page_count"));
                book.setPublishDate(rs.getDate("publish_year"));
                book.setPublisher(rs.getString("publisher"));
                book.setImage(new ImageIcon(rs.getBytes("image")).getImage());
                bookList.add(book);
            }

        } catch (SQLException ex) {
           System.out.println("ОШИБКА bookList.java");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println("ОШИБКА закрытия ресурсов bookList.jsp");
            }
        }
        System.out.println(bookList);
        return bookList;
    }

    public ArrayList<Book> getAllBooks() {
        if (!bookList.isEmpty()) {
            return bookList;
        } else {
            return getBooks("select * from book order by name");
        }
    }

    public ArrayList<Book> getBooksByGenre(long id) {;
        return getBooks("select b.id,b.name,b.isbn,b.page_count,b.publish_year, p.name as publisher, a.fio as author, g.name as genre, b.image from book b "
                + "inner join author a on b.author_id=a.id "
                + "inner join genre g on b.genre_id=g.id "
                + "inner join publisher p on b.publisher_id=p.id "
                + "where genre_id=" + id + " order by b.name "
                + "limit 0,5");
    

    }
}
