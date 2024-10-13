package main;

import config.ProjectConfig;
import domain.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;

import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs = context.getBean(CommentService.class);

        Comment c = new Comment();
        c.setText("Demo comment");
        c.setAuthor("Natasha");

        String value = cs.publishComment(c);

        logger.info(value);
    }
}
