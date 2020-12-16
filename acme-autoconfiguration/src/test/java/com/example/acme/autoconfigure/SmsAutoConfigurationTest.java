package com.example.acme.autoconfigure;

import acme.sms.SmsService;
import com.example.acme.autoconfigure.sms.SmsAutoConfiguration;
import com.example.acme.autoconfigure.sms.SmsProperties;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

public class SmsAutoConfigurationTest {
    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(SmsAutoConfiguration.class));

    @Test
    public void test() {
        contextRunner.withPropertyValues("acme.sms.host=127.0.0.1", "acme.sms.port=9090", "acme.sms.user-name=tsc",
                "acme.sms.password=admin123").run(context -> {
                    assertThat(context).hasSingleBean(SmsService.class);
                    assertThat(context).hasSingleBean(SmsProperties.class);
                    assertThat(context).getBean(SmsProperties.class).hasNoNullFieldsOrProperties();
                });
    }

}
