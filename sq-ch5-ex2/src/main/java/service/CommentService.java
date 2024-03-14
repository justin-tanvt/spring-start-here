package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CommentRepository;

@Service
public class CommentService {

    @Autowired
    private CommentRepository repo;

    public CommentRepository getRepo() {
        return repo;
    }
}
