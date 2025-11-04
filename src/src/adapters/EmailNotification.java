package adapters;

import ports.NotificationService;

import java.util.Objects;

public class EmailNotification implements NotificationService {
    @Override
    public void notify(String to, String subject, String message) {
        Objects.requireNonNull(to, "to must not be null");
        Objects.requireNonNull(subject, "subject must not be null");
        Objects.requireNonNull(message, "message must not be null");

        if (to.isBlank() || subject.isBlank() || message.isBlank()) {
            throw new IllegalArgumentException("cannot be blank");
        }

        System.out.printf("""
                To: %s
                Subject: %s
                
                %s
                
                """,
                to,
                subject,
                message
                );
    }
}
