package titarenko.javaproject.socialnetwork;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import titarenko.javaproject.socialnetwork.repository.UserRepository;

import java.util.Arrays;

/**
 * Created by MyMac on 4/21/16.
 */
public class SpringMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml");
        System.out.println(Arrays.toString(appCtx.getBeanDefinitionNames()));

//        UserRepository userRepository = (UserRepository) appCtx.getBean("mockUserRepository");
        UserRepository userRepository = appCtx.getBean(UserRepository.class);
        userRepository.getAll();
        appCtx.close();
    }
}
