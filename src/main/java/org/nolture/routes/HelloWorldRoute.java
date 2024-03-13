package org.nolture.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldRoute extends RouteBuilder {

    @Override
    public void configure(){
        // Configure REST DSL
        restConfiguration()
                .component("servlet") // Use servlet component for HTTP
                .bindingMode(RestBindingMode.auto);

        // Define the REST endpoint
        rest("/api")
                .post("/echo")
                .type(String.class) // Specify the request body type
                .consumes("text/plain")
                .produces("text/plain")
                .to("direct:echo");

        from("direct:echo")
                .setBody(simple("${body}"));
    }
}
