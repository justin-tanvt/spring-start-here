package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import repository.CommentRepository;

@Component
public class UserService {

    @Autowired
    private CommentRepository commentRepository;

    public UserService() {
        System.out.println("UserService instance created!");
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
