package br.edu.infnet.biblioteca.observer;

import java.util.ArrayList;
import java.util.List;

public class Dieta implements Observable {

    private final List<Observer> observers = new ArrayList<>();
    private Double peso;

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
            observer.update(peso);
        }
    }

    public void setPeso(final Double peso) {
        this.peso = peso;
        notifyObservers();
    }
}
