
import model.User;
import service.BookService;
import service.UserService;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) throws SQLException {
        BookService bookService = new BookService();
        //bookService.creatBook("LoveStory2","Maclean");
        System.out.println(bookService.getAllBook(""));
        //bookService.getBookById("3");
        //System.out.println(bookService.status("ali2"));
 /*       while (true) {
            System.out.println("------Welcome to Library------");
            System.out.println();
            System.out.println("1-add user");
            System.out.println("2-delete user");
            System.out.println("3-get user by id");
            System.out.println("4-get user by name & family");
            System.out.println("5-get all user");
            System.out.println("6-update user");
            System.out.println("7-add book");
            System.out.println("8-delete book");
            System.out.println("9-get book");
            System.out.println("10-update book");
            System.out.println("11-borrow");
            System.out.println("20-exit");
            System.out.println();
            System.out.println("enter your selection please: ");
            Scanner scanner = new Scanner(System.in);
            Integer select = scanner.nextInt();

            switch (select) {
                case 1:
                    System.out.println("add user");
                    System.out.print("name : ");
                    String name = scanner.next();
                    System.out.print("family : ");
                    String family = scanner.next();
                    System.out.println();
                    System.out.println(UserService.creatUser(new User(name, family)));
                    System.out.println();
                    break;
                case 2:
                    System.out.println("delete user");
                    System.out.println("id: ");
                    UserService.deleteUser(scanner.nextLong());
                    break;
                case 3:
                    System.out.println("get user by id");
                    System.out.println(UserService.getUserById(scanner.nextLong()));
                    break;
                case 4:
                    System.out.println("get user by name and family");
                    System.out.println("name : ");
                    name = scanner.next();
                    System.out.println("family : ");
                    family = scanner.next();
                    System.out.println(UserService.searchUserByName(name, family));
                    break;
                case 5:
                    System.out.println("all user");
                    System.out.println(UserService.getAllUser());
                    break;
                case 6 :
                    System.out.println("update user");
                    System.out.printf("id : ");
                    id= scanner.nextLong();
                    System.out.printf("name : ");
                    name=scanner.next();
                    System.out.printf("family : ");
                    family=scanner.next();
                    User user = new User(id,name,family);
                    System.out.println(UserService.updateUser(user));
                    break;

                case 7:
                    System.out.println("add book");
                    System.out.println("name : ");
                    name = scanner.next();
                    System.out.println("author : ");
                    author = scanner.next();
                    System.out.println(bookService.creatBook(new Book(name, Status.AVAILABLE, author)));
                    break;
                case 8 :
                    System.out.println("delete book");
                    System.out.printf("id : ");
                    id = scanner.nextLong();
                    bookService.deleteBook(id);
                    break;
                case 9:
                    System.out.println("all book");
                    System.out.println(bookService.getAllBook());
                    break;
                case 10 :
                    System.out.printf("id : ");
                    id = scanner.nextLong();
                    System.out.println(id);
                    System.out.printf("name : ");
                    name = scanner.next();
                    System.out.println(name);
                    System.out.printf("author : ");
                    author = scanner.next();
                    System.out.println(author);

                    break;

                case 13:
                    System.out.println("get by name and family");
                    System.out.println("name : ");
                    name = scanner.next();
                    System.out.println("family : ");
                    family = scanner.next();
                    System.out.println(UserService.searchUserByName(name, family).get());
                    break;
                case 19:
                    System.out.println("borrow book");
                    System.out.println("user name : ");
                    name = scanner.next();
                    System.out.println("family : ");
                    family = scanner.next();
                    user = UserService.searchUserByName(name, family).get();
                    System.out.println(user);
                    System.out.println("book name : ");
                    name = scanner.next();
                    Book book = bookService.searchBookByName(name).get();
                    System.out.println(book);
                    long millis = System.currentTimeMillis();
                    UserBook userBook = new UserBook(new Date(millis), Status.NOT_AVAILABLE, user.getId(), book.getId());
                    UserService.borrow(userBook);
                    break;
                case 20:
                    System.exit(130);
                    break;
            }

        }
*/


    }
}
