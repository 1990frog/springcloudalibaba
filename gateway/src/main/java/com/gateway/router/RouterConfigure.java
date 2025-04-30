package com.gateway.router;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouterConfigure {

    // @Bean
    // public RouteLocator customRoute(RouteLocatorBuilder builder) {
    //     return builder.routes()
    //             .route("producer", r -> r
    //                     .path("/test/**")
    //                     .filters(f -> f.stripPrefix(1))
    //                     .uri("http://localhost:8080/producer"))
    //             .build();
    // }

    @Bean
    public GlobalFilter loggingFilter() {
        return (exchange, chain) -> {
            System.out.println("请求路径：" + exchange.getRequest().getURI());
            return chain.filter(exchange);
        };
    }

}
