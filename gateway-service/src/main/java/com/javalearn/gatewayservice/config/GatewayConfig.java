package com.javalearn.gatewayservice.config;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {



    @Bean
    public RouteLocator routeLocator (RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route(r->r.path("/api/v1/org/**").uri("lb://ORGANIZATION-SERVICE/").id("organization-service"))
                .route(r->r.path("/customer/**").uri("lb://CUSTOMER-SERVICE/").id("customer-service"))
                .route(r->r.path("/user/**").uri("lb://SECURITY-SERVICE/").id("security-service"))
                .build();
    }
}
