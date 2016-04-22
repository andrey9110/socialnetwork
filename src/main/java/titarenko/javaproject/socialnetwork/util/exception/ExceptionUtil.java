package titarenko.javaproject.socialnetwork.util.exception;

/**
 * Created by MyMac on 4/21/16.
 */
public class ExceptionUtil {
    public static void check(boolean found, int id) {
        check(found, "id=" + id);
    }

    public static <T> T check(T object, int id) {
        return check(object, "id=" + id);
    }

    public static <T> T check(T object, String msg) {
        check(object != null, msg);
        return object;
    }

    public static void check(boolean found, String msg) {
        if (!found) throw new NotFoundException("Not found entity with " + msg);
    }
}
