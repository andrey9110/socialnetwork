package titarenko.javaproject.socialnetwork.web;

import org.slf4j.LoggerFactory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Objects;

import org.slf4j.Logger;
import titarenko.javaproject.socialnetwork.model.Post;
import titarenko.javaproject.socialnetwork.repository.InMemoryPostRepositoryImpl;
import titarenko.javaproject.socialnetwork.repository.PostRepository;
import titarenko.javaproject.socialnetwork.util.PostUtil;

/**
 * Created by MyMac on 4/21/16.
 */
public class PostServlet extends HttpServlet {
    private static final Logger LOG = LoggerFactory.getLogger(PostServlet.class);

    private PostRepository repository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        repository = new InMemoryPostRepositoryImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String id = request.getParameter("id");
        Post post = new Post(id.isEmpty() ? null : Integer.valueOf(id),
                LocalDateTime.parse(request.getParameter("dateTime")),
                request.getParameter("description"));
        LOG.info(post.isNew() ? "Create {}" : "Update {}", post);
        repository.save(post);
        response.sendRedirect("posts");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            LOG.info("getAll");
            request.setAttribute("postList",
                    repository.getAll());
            request.getRequestDispatcher("/postList.jsp").forward(request, response);
        } else if (action.equals("delete")) {
            int id = getId(request);
            LOG.info("Delete {}", id);
            repository.delete(id);
            response.sendRedirect("posts");
        } else {
            final Post post = action.equals("create") ?
                    new Post(LocalDateTime.now(), "") :
                    repository.get(getId(request));
            request.setAttribute("post", post);
            request.getRequestDispatcher("postEdit.jsp").forward(request, response);
        }
    }

    private int getId(HttpServletRequest request) {
        String paramId = Objects.requireNonNull(request.getParameter("id"));
        return Integer.valueOf(paramId);
    }
}
