package titarenko.javaproject.socialnetwork.util;

import titarenko.javaproject.socialnetwork.model.Post;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

/**
 * Created by MyMac on 4/21/16.
 */
public class PostUtil {
    public static final List<Post> wall = Arrays.asList(
            new Post(LocalDateTime.of(2015, Month.MAY, 30, 10, 0), "Кто не рискует, тот не пьет шампанского"),
            new Post(LocalDateTime.of(2015, Month.MAY, 30, 13, 0), "Богатство разум рождает."),
            new Post(LocalDateTime.of(2015, Month.MAY, 30, 20, 0), "Слепой сказал: посмотрим."),
            new Post(LocalDateTime.of(2015, Month.MAY, 31, 10, 0), "Грех воровать, да нельзя миновать."),
            new Post(LocalDateTime.of(2015, Month.MAY, 31, 13, 0), "Бедному жениться ночь коротка."),
            new Post(LocalDateTime.of(2015, Month.MAY, 31, 20, 0), "Авось не унывает.")
    );

    public static List<Post> getPosts(){
        return wall;
    }
}
