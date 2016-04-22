package titarenko.javaproject.socialnetwork.repository;

import titarenko.javaproject.socialnetwork.model.User;

import java.util.List;

/**
 * Created by MyMac on 4/21/16.
 */
public class InMemoryUserRepositoryImpl implements UserRepository {
    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public User getByEmail(String email) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
