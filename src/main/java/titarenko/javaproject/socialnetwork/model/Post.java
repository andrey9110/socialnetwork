package titarenko.javaproject.socialnetwork.model;

import java.time.LocalDateTime;

/**
 * Created by MyMac on 4/20/16.
 */
public class Post extends BaseEntity {
    private Integer id;

    private final LocalDateTime dateTime;

    private final String description;

    private User user;


    public Post(LocalDateTime dateTime, String description) {
        this(null, dateTime, description);
    }

    public Post(Integer id, LocalDateTime dateTime, String description) {
        this.id = id;
        this.dateTime = dateTime;
        this.description = description;
    }


    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return description;
    }

    public Integer getId() {
        return id;
    }

    public boolean isNew() {
        return id == null;
    }

    @Override
    public String toString() {
        return "UserMeal{" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", description='" + description + '\'' +
                '}';
    }
}
