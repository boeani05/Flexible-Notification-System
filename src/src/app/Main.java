package app;

import domain.RegistrationNotifier;

public class Main {
    public static void main(String[] args) {
        String channel = "email";

        if (args != null && args.length >= 1) {
            channel = args[0];
        }

        channel = channel.trim().toLowerCase();

        switch (channel) {
            case "email":
                System.out.println("Using Email Notification!");
                break;
            case "fake":
                System.out.println("Using Fake Notification!");
                break;
            default:
                throw new IllegalArgumentException("Unknown channel: " + channel);
        }
    }
}
