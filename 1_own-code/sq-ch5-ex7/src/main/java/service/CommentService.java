package service;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import processor.CommentProcessor;

@Service
public class CommentService {

    @Autowired
    private ApplicationContext context;

    public CommentService() {
        System.out.println("CommentService instance created!");
    }

    public void sendComment(Comment c) {
        CommentProcessor p = context.getBean(CommentProcessor.class);

        p.setComment(c);
        p.processComment();
        p.validateComment();

        c = p.getComment();
    }
}
