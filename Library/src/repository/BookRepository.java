package repository;

import config.MySQLAccess;
import model.Book;
import util.BookEnumStatus;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import static config.MySQLAccess.close;


public class BookRepository {
    public BookRepository() {
    }

    MySQLAccess mySQLAccess = new MySQLAccess();

    public void creatBook(String name, String author) throws SQLException {
        mySQLAccess.creatQuery("Insert into book(nameBook,author,BookStatus) " +
                " values( '" + name + "' , '" + author + "' , " + 1 + ")");
    }

    public List<Book> getAllBook(String name) throws SQLException {
        String whereClause = "";
        if (!name.equals("")) {
            whereClause = "where b.nameBook = '" + name + "'";
        }
        ResultSet resultSet = mySQLAccess.SQLQuery("select * from library.book b " + whereClause);
        List<Book> books = new LinkedList<>();
        while (resultSet.next()) {
            Book book = new Book(
                    String.valueOf(resultSet.getInt(1)),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    BookEnumStatus.findValue(resultSet.getInt(4)));
            books.add(book);
        }
        close();
        return books;
    }


    public Book getBookById(String id) throws SQLException {
        String whereClause = "";
        if (!id.equals("")) {
            whereClause = "where b.id = '" + id + "'";
        }
        ResultSet resultSet = mySQLAccess.SQLQuery("select * from library.book b " + whereClause);

        while (resultSet.next()) {
            Book book = new Book(
                    String.valueOf(resultSet.getInt(1)),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    BookEnumStatus.findValue(resultSet.getInt(4)));
            System.out.println(book);
            return book;
        }
        resultSet.close();
        return null;
    }


    public Book searchBookByName(String name) {
        return null;
    }


    public ResultSet update(BookEnumStatus status) throws SQLException {
        int state = 1;
        if (status.equals(BookEnumStatus.BURROW)) {
            state = BookEnumStatus.BURROW.getStatus();
        } else if (status.equals(BookEnumStatus.RETURN)) {
            state = BookEnumStatus.RETURN.getStatus();
        }
        System.out.println("");
        return mySQLAccess.SQLQuery(" update library.book_user set BookStatus= " + state);
    }


    public void deleteBook(Long id) {

    }

    public String status(String name) throws SQLException {
        String whereClause = "";
        if (!name.equals("")) {
            whereClause = "where b.nameBook = '" + name + "'";
        }
        ResultSet resultSet = mySQLAccess.SQLQuery("select b.BookStatus from library.book b " + whereClause);
        while (resultSet.next()) {
            String status = String.valueOf(BookEnumStatus.findValue(resultSet.getInt(1)));
            return status;
        }
        resultSet.close();
        return null;
    }
}
