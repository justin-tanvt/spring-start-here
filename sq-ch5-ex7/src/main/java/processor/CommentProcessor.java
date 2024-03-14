package processor;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import repository.CommentRepository;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {
    private Comment comment;

    @Autowired
    private CommentRepository commentRepository;

    public CommentProcessor()  {
        System.out.println("CommentProcessor[" + this.hashCode() + "] instantiated!");
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void processComment() {
        System.out.println("CommentProcessor[" + this.hashCode() + "] processed comment!");
    }

    public void validateComment() {
        System.out.println("CommentProcessor[" + this.hashCode() + "] validated comment!");
    }
}
