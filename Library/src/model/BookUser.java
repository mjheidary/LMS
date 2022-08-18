package model;

import util.BookEnumStatus;
import java.util.Date;

public class BookUser {
    private int id;
    private Date date;
    private BookEnumStatus bookEnumStatus;
    private int idBook;
    private int idUser;

    public BookUser(Date date, BookEnumStatus bookEnumStatus, int idBook, int idUser) {
        this.date = date;
        this.bookEnumStatus = bookEnumStatus;
        this.idBook = idBook;
        this.idUser = idUser;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BookEnumStatus getBookEnumStatus() {
        return bookEnumStatus;
    }

    public void setBookEnumStatus(BookEnumStatus bookEnumStatus) {
        this.bookEnumStatus = bookEnumStatus;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
