package ua.test_servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mega on 30.09.2016.
 */
// Для обработки HTTP request
public class BookServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // сюда будем складывать книги из БД (здесь без БД - создадим вручную)
        List<Book> books = new ArrayList<>();

        // складываем книги в List books (предполагаем, что из ResultSet)
        books.add(new Book(1L, "Java for beginners"));
        books.add(new Book(2L, "Java for middle"));
        books.add(new Book(3L, "Java for experts"));

        // кидаем коллекцию книг в Attribute, чтобы она сохранилась по завершении работы Servlet и была доступна JSP
        req.setAttribute("bookList", books);

        // передаем управление из сервлета в JSP и стартуем процесс - forward()
        req.getServletContext().getRequestDispatcher("/books.jsp").forward(req, resp);

    }
}
