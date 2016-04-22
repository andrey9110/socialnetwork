package titarenko.javaproject.socialnetwork.service;

import titarenko.javaproject.socialnetwork.model.User;
import titarenko.javaproject.socialnetwork.util.exception.NotFoundException;

import java.util.List;

/**
 * Created by MyMac on 4/21/16.
 */
public interface UserService {

    User save(User user);

    void delete(int id) throws NotFoundException;

    User get(int id) throws NotFoundException;

    User getByEmail(String email) throws NotFoundException;

    List<User> getAll();

    void update(User user);
}
