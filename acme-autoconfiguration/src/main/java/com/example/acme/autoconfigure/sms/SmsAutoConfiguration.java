package com.example.acme.autoconfigure.sms;

import acme.sms.SmsService;
import acme.sms.config.SmsServerProperties;
import acme.sms.impl.SmsServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Nonnull;

@Configuration(proxyBeanMethods = false)
@ConditionalOnClass(SmsService.class)
@EnableConfigurationProperties(SmsProperties.class)
public class SmsAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(SmsService.class)
    public SmsService smsService(@Nonnull SmsProperties smsProperties){
        SmsServerProperties serverProperties = new SmsServerProperties();
        serverProperties.setHost(smsProperties.getHost());
        serverProperties.setPassword(smsProperties.getPassword());
        serverProperties.setPort(smsProperties.getPort());
        serverProperties.setUserName(smsProperties.getUserName());
        return new SmsServiceImpl(serverProperties);
    }

}
