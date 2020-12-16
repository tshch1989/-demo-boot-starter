package acme.sms.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.annotation.Nonnull;

@Getter
@Setter
@ToString
public class SmsServerProperties {
    @Nonnull
    private String host;
    @Nonnull
    private Integer port;
    @Nonnull
    private String userName;
    @Nonnull
    private String password;
}
