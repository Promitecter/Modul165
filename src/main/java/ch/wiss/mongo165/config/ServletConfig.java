package ch.wiss.mongo165.config;

import ch.wiss.mongo165.servlet.DemoServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {

    // @Bean
    // public ServletRegistrationBean<InfoServlet> infoServlet() {
    //    return new ServletRegistrationBean<>(new InfoServlet(), "/info");
    // }

    @Bean
    public ServletRegistrationBean<DemoServlet> demoServlet() {
        return new ServletRegistrationBean<>(new DemoServlet(), "/demo");
    }

}


