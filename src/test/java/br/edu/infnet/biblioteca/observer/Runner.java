package br.edu.infnet.biblioteca.observer;

public class Runner {

    public static void main(String[] args) {

        BalancaObserver balanca = new BalancaObserver();
        Dieta dieta = new Dieta();
        dieta.registerObserver(balanca);
        dieta.setPeso(150.0);
        dieta.setPeso(200.0);

        AlturaObserver alturaObserver = new AlturaObserver();
        Altura altura = new Altura();
        altura.registerObserver(alturaObserver);
        altura.setAltura(1.80);

    }
}
