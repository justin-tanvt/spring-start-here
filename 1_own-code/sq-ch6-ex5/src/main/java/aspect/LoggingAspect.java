package aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @AfterReturning(value = "@annotation(ToLog)",
    returning = "returnedValue")
    public void logAfterReturn(Object returnedValue) {
        logger.info("Method executed and returned [" + returnedValue + "]");
    }
}
