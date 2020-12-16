package acme.email.impl;

import acme.email.EmailService;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.IOException;

@Slf4j
public class EmailServiceImpl implements EmailService {

    public boolean send(@Nonnull String email, @Nonnull String content) {
        log.info("email send email:{},context:{}", email, content);
        return true;
    }

    @PostConstruct
    public void start() {
        //初始化
        log.info("email service start...");
    }

    @PreDestroy
    public void close() throws IOException {
        //关闭
        log.info("email service close...");
    }
}
