package service;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import processor.CommentProcessor;
import repository.CommentRepository;

@Component
public class UserService {

    public UserService() {
        System.out.println("UserService instance created!");
    }
}
