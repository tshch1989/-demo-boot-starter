package com.example.acme.autoconfigure.email;

import acme.email.EmailService;
import acme.email.impl.EmailServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@ConditionalOnClass(EmailService.class)
public class EmailAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(EmailService.class)
    public EmailService emailService(){
        return new EmailServiceImpl();
    }

}
