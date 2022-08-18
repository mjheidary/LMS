package repository;

import model.Book;
import model.User;

import java.util.ArrayList;
import java.util.Optional;

public interface BookUserRepoImp {
    Optional<User> lastUserGetBook(String book);
    Optional<ArrayList<Book>> lastUserBook(String user);
}
