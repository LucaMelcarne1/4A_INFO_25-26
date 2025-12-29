class App { // [cite: 1]
    public static void main(String[] args) {
        
        // Creo i giocatori
        Giocatore g1 = new Giocatore();
        Giocatore g2 = new Giocatore();
    
        // Assegno ai due giocatori nomi, cognomi e dadi
        
        // Primo giocatore
        g1.nome = "Mario";
        g1.cognome = "Rossi";

        Dado d1 = new Dado();
        g1.dado = d1;

        // Secondo giocatore
        g2.nome = "Luigi";
        g2.cognome = "Verdi";
        g2.dado = new Dado();

        // Gioco la partita
        Partita partita = new Partita();

        // Assegno i giocatori alla partita
        partita.player1 = g1;
        partita.player2 = g2;

        // Avvio la partita
        partita.avviaPartita();


        // Verifico il giocatore vincitore
        Giocatore vincitore = partita.checkVincitore();

        if (vincitore != null) {
            System.out.println("Vince: " + vincitore.nome);
        } else {
            System.out.println("Pareggio!");
        }
    }
}