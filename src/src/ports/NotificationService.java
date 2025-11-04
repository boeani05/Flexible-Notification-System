package ports;

public interface NotificationService {
    void notify(String to, String subject, String message);
}
