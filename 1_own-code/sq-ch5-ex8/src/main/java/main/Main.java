package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService cs1 = c.getBean(CommentService.class);
        CommentService cs2 = c.getBean(CommentService.class);
        System.out.println(cs1.getCommentProcessor() == cs2.getCommentProcessor());
    }
}
