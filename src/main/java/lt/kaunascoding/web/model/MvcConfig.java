package lt.kaunascoding.web.model;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/first").setViewName("first");
        registry.addViewController("/").setViewName("first");
        registry.addViewController("/naujienos").setViewName("naujienos");
        registry.addViewController("/lala").setViewName("lala");
    }

}