package com.example.login;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication(scanBasePackages = "com.example")
@RequiredArgsConstructor
@EnableCaching
@EntityScan("com.example.common.domain")
@EnableJpaRepositories("com.example.common.domain")
public class KubermarketLoginApplication  {

    public static void main(String[] args) {
        SpringApplication.run(KubermarketLoginApplication.class, args);
    }

}
