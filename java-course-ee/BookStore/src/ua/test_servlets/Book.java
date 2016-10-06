package ua.test_servlets;

/**
 * Created by mega on 30.09.2016.
 */
// Сервлет вытащит из БД данные для книги и поместит их в инстанс Book. А его мы поместим в коллекцию Book
    // Для того, чтобы можно было работать в JSP c EL класс Book должен быть - Bean (крнструктор по умолчанию, геттеры, сеттеры)
public class Book {
    private Long id;
    private String name;

    public Book() {
    }

    public Book(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name;
    }
}
