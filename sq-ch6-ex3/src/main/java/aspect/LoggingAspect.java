package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* service.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("aspect method starting!");

        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        logger.info("Method " + methodName + " with parameters " + Arrays.asList(arguments) + " will execute");

        Object returnedByMethod = joinPoint.proceed();
        logger.info("Method executed and returned " + returnedByMethod);

        logger.info("aspect method ending!");
        return returnedByMethod;
    }
}
