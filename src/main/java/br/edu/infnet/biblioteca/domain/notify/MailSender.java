package br.edu.infnet.biblioteca.domain.notify;

public class MailSender {

    private final String title;
    private final String destination;
    private final String message;

    public MailSender(final String title, final String destination, final String message) {
        this.title = title;
        this.destination = destination;
        this.message = message;
    }

    public void sendMessage() {
        System.out.printf("Send email with title %s to: %s with message: %s%n", title, destination, message);
    }
}
