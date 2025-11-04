package adapters;

import ports.NotificationService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FakeNotification implements NotificationService {
    private final List<Delivery> deliveries;

    public FakeNotification() {
        this.deliveries = new ArrayList<>();
    }

    @Override
    public void notify(String to, String subject, String message) {
        Objects.requireNonNull(to);
        Objects.requireNonNull(subject);
        Objects.requireNonNull(message);

        deliveries.add(new Delivery(to, subject, message));
    }

    public List<Delivery> getDeliveries() {
        return List.copyOf(deliveries);
    }
}
