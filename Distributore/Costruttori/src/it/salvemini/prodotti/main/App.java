package it.salvemini.prodotti.main;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Utilizziamo il costruttore che imposta valori di default
        Prodotto patatine = new Prodotto();
        
        System.out.println("il nome del prodotto creato con valori di default è: " + patatine.nome);

        patatine.quantità = 3;
        patatine.prezzo = 0.80;
        patatine.nome = "patatine";

        System.out.println("il nome del prodotto dopo la modifica degli attributi è: " + patatine.nome);

        // Utilizziamo il costruttore che accetta parametri in input
        Prodotto fanta = new Prodotto(5, 1.20, "fanta");
        System.out.println("il nome del prodotto è: " + fanta.nome);
        System.out.println("il suo prezzo è di: " + fanta.prezzo);

    }
}
