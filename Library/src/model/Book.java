package model;

import util.BookEnumStatus;

public class Book {
    private String id;
    private String name;
    private String author;
    private BookEnumStatus status;

    public Book(String name, String author, BookEnumStatus status) {
        this.name = name;
        this.author = author;
        this.status = status;
    }

    public Book(String id, String name, String author, BookEnumStatus status) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookEnumStatus getStatus() {
        return status;
    }

    public void setStatus(BookEnumStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", status=" + status +
                '}';
    }
}
