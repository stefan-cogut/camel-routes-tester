package org.nolture;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"org.nolture.routes"})
public class CamelRoutesTesterApplication {

    @Autowired
    ProducerTemplate template;

    public static void main(String[] args) {
        SpringApplication.run(CamelRoutesTesterApplication.class, args);
    }


}
