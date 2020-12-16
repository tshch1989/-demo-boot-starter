package acme.sms;

import acme.Manager;

import javax.annotation.Nonnull;

public interface SmsService extends Manager {
    boolean send(@Nonnull String phone,@Nonnull String msg);
}
