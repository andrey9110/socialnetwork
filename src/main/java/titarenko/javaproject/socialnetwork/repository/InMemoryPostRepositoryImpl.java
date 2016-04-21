package titarenko.javaproject.socialnetwork.repository;

import titarenko.javaproject.socialnetwork.model.Post;
import titarenko.javaproject.socialnetwork.util.PostUtil;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by MyMac on 4/21/16.
 */
public class InMemoryPostRepositoryImpl implements PostRepository {
    private Map<Integer, Post> repository = new ConcurrentHashMap<>();
    private AtomicInteger counter = new AtomicInteger(0);

    {
        PostUtil.getPosts().forEach((post) -> save(post));
    }

    @Override
    public Post save(Post post) {
        if (post.isNew()) {
            post.setId(counter.incrementAndGet());
        }
        repository.put(post.getId(), post);
        return post;
    }

    @Override
    public void delete(int id) {
        System.out.println(repository.size());
        repository.remove(id);
        System.out.println(repository.size());
    }

    @Override
    public Post get(int id) {
        return repository.get(id);
    }

    @Override
    public Collection<Post> getAll() {
        return repository.values();
    }
}
