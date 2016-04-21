package titarenko.javaproject.socialnetwork.repository;

import titarenko.javaproject.socialnetwork.model.Post;

import java.util.Collection;

/**
 * Created by MyMac on 4/21/16.
 */
public interface PostRepository {

    Post save(Post post);

    void delete(int id);

    Post get(int id);

    Collection<Post> getAll();
}
