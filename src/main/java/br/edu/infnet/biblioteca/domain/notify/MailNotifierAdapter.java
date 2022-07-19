package br.edu.infnet.biblioteca.domain.notify;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MailNotifierAdapter implements Notifier {
    private static String DEFAULT_TITLE = "Reserved Book with success!";

    @Override
    public void notify(final String destination, final String message) {
        MailSender mailSender = new MailSender(DEFAULT_TITLE, destination, message);
        mailSender.sendMessage();
    }
}
