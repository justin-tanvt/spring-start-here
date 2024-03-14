package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = c.getBean(CommentService.class);
        commentService.sendComment(new Comment());
        commentService.sendComment(new Comment());
    }
}
