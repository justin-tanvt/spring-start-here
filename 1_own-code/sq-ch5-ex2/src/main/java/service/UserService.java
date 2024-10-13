package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CommentRepository;

@Service
public class UserService {

    @Autowired
    private CommentRepository repo;

    public CommentRepository getRepo() {
        return repo;
    }
}
