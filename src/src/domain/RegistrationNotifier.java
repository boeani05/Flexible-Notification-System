package domain;

import ports.NotificationService;

public class RegistrationNotifier {
    private final NotificationService service;
    private static final String SUBJECT_WELCOME = "Welcome!";
    private static final String BODY_WELCOME = "Welcome! Thank you for choosing us!";

    public RegistrationNotifier(NotificationService service) {
        if (service == null) {
            throw new IllegalArgumentException("NotificationServie cannot be null");
        }
        this.service = service;
    }

    public void sendWelcome(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }

        if (user.email() == null) {
            throw new IllegalArgumentException("User email cannot be empty");
        }
        service.notify(user.email(), SUBJECT_WELCOME, BODY_WELCOME);
    }
}
