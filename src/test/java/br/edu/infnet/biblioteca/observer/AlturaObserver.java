package br.edu.infnet.biblioteca.observer;

public class AlturaObserver implements Observer {

    @Override
    public void update(final Double altura) {
        validate(altura);
    }

    private void validate(final Double altura) {
        if (altura >= 1.50) {
            System.out.println("Não é anão!");
        }
    }
}
