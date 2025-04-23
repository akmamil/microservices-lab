package project.apigateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Configuration
public class GatewayConfig {

    @Bean
    public GlobalFilter customLogFilter() {
        return (exchange, chain) -> {
            System.out.println(">>> Request passed through GATEWAY: " + exchange.getRequest().getPath());
            return chain.filter(exchange);
        };
    }
}

