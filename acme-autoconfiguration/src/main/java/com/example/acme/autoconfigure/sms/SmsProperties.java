package com.example.acme.autoconfigure.sms;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.Nonnull;

@Getter
@Setter
@ToString
@ConfigurationProperties("acme.sms")
public class SmsProperties {
    @Nonnull
    private String host;
    @Nonnull
    private Integer port;
    @Nonnull
    private String userName;
    @Nonnull
    private String password;
}
