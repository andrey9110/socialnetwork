package titarenko.javaproject.socialnetwork.repository;

import titarenko.javaproject.socialnetwork.model.User;

import java.util.List;

/**
 * Created by MyMac on 4/21/16.
 */
public interface UserRepository {
    User save(User user);

    // false if not found
    boolean delete(int id);

    // null if not found
    User get(int id);

    // null if not found
    User getByEmail(String email);

    List<User> getAll();
}
