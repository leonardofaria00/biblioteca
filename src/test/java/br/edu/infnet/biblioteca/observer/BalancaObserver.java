package br.edu.infnet.biblioteca.observer;

public class BalancaObserver implements Observer {

    @Override
    public void update(final Double peso) {
        if (peso >= 100) {
            System.out.println("Você utrapassou o peso!");
        }
    }
}
