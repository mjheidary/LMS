package service;

import model.Book;
import repository.BookRepository;
import util.BookEnumStatus;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class BookService {
    public BookService() {}

    BookRepository bookRepository = new BookRepository();

    public void creatBook(String name, String author) throws SQLException {
        bookRepository.creatBook(name, author);
        System.out.println("Book : ( " + name + " ), Author: ( " + author + " ) is Saved");
    }

    public List<Book> getAllBook(String name) throws SQLException {
        List<Book> bookList=bookRepository.getAllBook(name);
        return bookList;
    }

    public Book getBookById(String id) throws SQLException {
        return bookRepository.getBookById(id);
    }

    public List<Book> searchBookByName(String name) throws SQLException {
        return bookRepository.getAllBook(name);
    }


    public ResultSet update(BookEnumStatus status) throws SQLException {
        return bookRepository.update(status);
    }


    public void deleteBook(Long id) {
        bookRepository.deleteBook(id);
        System.out.println("Book was Deleted");

    }

    public String status(String name) throws SQLException {
        return bookRepository.status(name);
    }


}
