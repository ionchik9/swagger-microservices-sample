package com.ion.swagger.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "service")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceConfig {
        private String jsonUrl;
        private String version;
        private String apiGatewayPublicUrl;
}


