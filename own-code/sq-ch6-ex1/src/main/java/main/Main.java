package main;

import config.ProjectConfig;
import domain.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs = context.getBean(CommentService.class);

        Comment c = new Comment();
        c.setText("Demo comment");
        c.setAuthor("Natasha");

        cs.publishComment(c);
    }
}
