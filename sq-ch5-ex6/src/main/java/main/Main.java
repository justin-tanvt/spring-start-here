package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;
import service.UserService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs = c.getBean("commentService", CommentService.class);
        var us = c.getBean("userService", UserService.class);

        System.out.println(cs.getCommentRepository() == us.getCommentRepository());
    }
}
