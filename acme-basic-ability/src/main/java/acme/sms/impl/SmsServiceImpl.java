package acme.sms.impl;

import acme.sms.SmsService;
import acme.sms.config.SmsServerProperties;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;

@Slf4j
public class SmsServiceImpl implements SmsService {

    private final SmsServerProperties smsServerProperties;

    public SmsServiceImpl(@Nonnull SmsServerProperties smsServerProperties){
        this.smsServerProperties = smsServerProperties;
    }

    public boolean send(@Nonnull String phone, @Nonnull String msg) {
        //执行业务
        log.info("sms send phone:{}, msg:{} " ,phone , msg);
        return true;
    }

    @PostConstruct
    public void start() {
        //初始化连接
        log.info("sms service start...,use config: {}", smsServerProperties);
    }

    @PreDestroy
    public void close() throws IOException {
        //关闭连接
        log.info("sms service close...");
    }
}
