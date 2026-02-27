package it.salvemini.prodotti.model;

public class Prodotto {

    //ATTRIBUTI
    private int quantità;
    private double prezzo;
    private String nome;

    //costruttore//
    public Prodotto () {
        quantità = 0;
        prezzo = 0;
        nome = "default";
    }

    public Prodotto (int quantità, double prezzo, String nome) {
        this.quantità = quantità;
        this.prezzo = prezzo;
        this.nome = nome;
    }

}
