package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CommentRepository;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public CommentService() {
        System.out.println("CommentService instance created!");
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
