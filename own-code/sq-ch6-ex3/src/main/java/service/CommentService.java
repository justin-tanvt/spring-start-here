package service;

import domain.Comment;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {
        logger.info("Publishing comment:" + comment.getText());
        return "SUCCESS";
    }
}
