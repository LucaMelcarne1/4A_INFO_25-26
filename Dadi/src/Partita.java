class Partita {
    Giocatore player1; 
    Giocatore player2; 

    void avviaPartita() {

        System.out.println("Inizio Partita");

        // I giocatori lanciano il dado
        player1.lancio();
        player2.lancio();

        // Accesso diretto ai campi senza usare getter
        System.out.println(player1.nome + " ha fatto: " + player1.dado.numeroEstratto);
        System.out.println(player2.nome + " ha fatto: " + player2.dado.numeroEstratto);
    }

    Giocatore checkVincitore() { // [cite: 5]
        // Accesso diretto a numeroEstratto grazie all'assenza di 'private'
        if (player1.dado.numeroEstratto > player2.dado.numeroEstratto) {
            return player1;
        } else if (player2.dado.numeroEstratto > player1.dado.numeroEstratto) {
            return player2;
        } else {
            return null;
        }
    }
}