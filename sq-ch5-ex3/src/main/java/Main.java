import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;
import service.UserService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs = context.getBean(CommentService.class);
        var us = context.getBean(UserService.class);

        System.out.println(cs.getRepo() == us.getRepo());
    }
}
