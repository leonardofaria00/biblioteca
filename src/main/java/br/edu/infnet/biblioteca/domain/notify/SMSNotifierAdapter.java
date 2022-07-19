package br.edu.infnet.biblioteca.domain.notify;

import org.springframework.stereotype.Component;

@Component
public class SMSNotifierAdapter implements Notifier {

    @Override
    public void notify(final String destination, final String message) {
        System.out.printf("Send SMS to: %s with message: %s%n", destination, message);
    }
}
