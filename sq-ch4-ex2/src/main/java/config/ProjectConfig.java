package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import proxies.EmailCommentNotificationProxy;
import repositories.DBCommentRepository;
import services.CommentService;

@Configuration
// @ComponentScan(basePackages = {"proxies", "repositories", "services"})
@ComponentScan(basePackageClasses = {
        EmailCommentNotificationProxy.class,
        DBCommentRepository.class,
        CommentService.class
})
public class ProjectConfig {
}
