package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;

@Configuration
public class ProjectConfig {

    @Bean
    EmailCommentNotificationProxy emailCommentNotificationProxy() {
        var emailCommentNotificationProxy = new EmailCommentNotificationProxy();
        return emailCommentNotificationProxy;
    }

    @Bean
    DBCommentRepository dbCommentRepository() {
        var dbCommentRepository = new DBCommentRepository();
        return dbCommentRepository;
    }

    @Bean
    CommentService commentService(
            CommentNotificationProxy commentNotificationProxy,
            CommentRepository commentRepository
    ) {
        return new CommentService(commentNotificationProxy, commentRepository);
    }
}
