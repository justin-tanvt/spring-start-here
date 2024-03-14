package service;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import processor.CommentProcessor;

@Service
public class CommentService {

    @Autowired
    private CommentProcessor p;

    public CommentService() {
        System.out.println("CommentService instance created!");
    }

    public void sendComment(Comment c) {
        p.setComment(c);
        p.processComment();
        p.validateComment();

        c = p.getComment();
    }

    public CommentProcessor getCommentProcessor() {
        return this.p;
    }
}
