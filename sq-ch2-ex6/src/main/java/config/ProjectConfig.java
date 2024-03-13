package config;

import main.Parrot;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "main")
// the @ComponentScan annotation tells Spring that there are components to look for and instantiate/add to its context
// it searches for these classes in the package indicated by the basePackages parameter
public class ProjectConfig {
}
