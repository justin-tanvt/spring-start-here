package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import repository.CommentRepository;
import service.CommentService;
import service.UserService;

@Configuration
@ComponentScan(basePackages = {
        "repository",
        "processor",
        "service"
})
public class ProjectConfig {
}
