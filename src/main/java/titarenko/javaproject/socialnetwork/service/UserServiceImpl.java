package titarenko.javaproject.socialnetwork.service;

import titarenko.javaproject.socialnetwork.model.User;
import titarenko.javaproject.socialnetwork.repository.UserRepository;
import titarenko.javaproject.socialnetwork.util.exception.ExceptionUtil;
import titarenko.javaproject.socialnetwork.util.exception.NotFoundException;

import java.util.List;

/**
 * Created by MyMac on 4/21/16.
 */
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public void delete(int id) throws NotFoundException {
        ExceptionUtil.check(repository.delete(id),id);
    }

    @Override
    public User get(int id) throws NotFoundException {
        return ExceptionUtil.check(repository.get(id), id);
    }

    @Override
    public User getByEmail(String email) throws NotFoundException {
        return ExceptionUtil.check(repository.getByEmail(email), "email=" + email);
    }

    @Override
    public List<User> getAll() {
        return repository.getAll();

    }

    @Override
    public void update(User user) {
        repository.save(user);

    }
}
