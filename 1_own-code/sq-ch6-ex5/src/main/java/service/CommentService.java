package service;

import aspect.ToLog;
import domain.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publishing comment:" + comment.getText());
    }

    @ToLog
    public String deleteComment(Comment comment) {
        logger.info("Deleting comment:" + comment.getText());
        return "Deleted comment:" + comment.getText();
    }

    public void editComment(Comment comment) {
        logger.info("Editing comment:" + comment.getText());
    }
}
