package br.edu.infnet.biblioteca.observer;

import java.util.ArrayList;
import java.util.List;

public class Altura implements Observable {

    private final List<Observer> observers = new ArrayList<>();

    private Double altura;

    @Override
    public void registerObserver(final Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(final Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            System.out.println("Notificando observers!");
            observer.update(altura);
        }
    }

    public void setAltura(final Double altura) {
        this.altura = altura;
        notifyObservers();
    }
}
