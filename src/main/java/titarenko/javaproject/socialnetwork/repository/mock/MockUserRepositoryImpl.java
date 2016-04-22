package titarenko.javaproject.socialnetwork.repository.mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import titarenko.javaproject.socialnetwork.model.User;
import titarenko.javaproject.socialnetwork.repository.UserRepository;

import java.util.Collections;
import java.util.List;

/**
 * Created by MyMac on 4/21/16.
 */
public class MockUserRepositoryImpl implements UserRepository {
    private static final Logger LOG = LoggerFactory.getLogger(MockUserRepositoryImpl.class);

    @Override
    public User save(User user) {
        LOG.info("save" + user);
        return user;
    }

    @Override
    public boolean delete(int id) {
        LOG.info("delete" + id);
        return true;
    }

    @Override
    public User get(int id) {
        LOG.info("get" + id);

        return null;
    }

    @Override
    public User getByEmail(String email) {
        LOG.info("getByEmail" + email);

        return null;
    }

    @Override
    public List<User> getAll() {
        LOG.info("getAll");
        return Collections.emptyList();
    }
}
