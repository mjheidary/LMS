package repository;

import model.User;

import java.util.ArrayList;
import java.util.Optional;

public interface UserRepoImp {
    User creatUser(User user);//down
    Optional<ArrayList<User>> getAllUser();//down
    Optional<User> getUserById(Long id);//down
    Optional<User> searchUserByName(String name,String family);//down
    User updateUser(User user);
    void deleteUser(Long id);//down
}
