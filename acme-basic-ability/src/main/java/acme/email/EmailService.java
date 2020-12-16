package acme.email;

import acme.Manager;

import javax.annotation.Nonnull;

public interface EmailService extends Manager {
    boolean send(@Nonnull String email,@Nonnull String content);
}
