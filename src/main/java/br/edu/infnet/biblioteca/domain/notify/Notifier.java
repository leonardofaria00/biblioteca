package br.edu.infnet.biblioteca.domain.notify;

public interface Notifier {

    void notify(String destination, String message);
}
