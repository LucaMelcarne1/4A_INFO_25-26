public class App {
    public static void main(String[] args) {
        
        // 1. Creazione oggetti (Istanziazione)
        Monopattino m1 = new Monopattino();
        Utente u1 = new Utente();

       
        // 2. Inizializzazione valori iniziali....
        
        // ... per l'utente
        u1.nome = "Matteo";
        u1.cognome = "Bianchi";
        u1.credito = 0;

        // ... per il monopattino
        m1.codice = "ABC1";
        m1.batteria = 100;
        m1.disponibile = true;

        
        // 3. Noleggio del monopattino

        // innanzitutto, ricaricare il credito
        u1.ricaricaCredito(10.0); // Carica 10 euro

        // provo a noleggiare il monopattino
        if (m1.disponibile && m1.batteria > 20) {
            // il monopattino diviene NON disponibile
            m1.disponibile = false;
            System.out.println("Noleggio avviato per " + m1.codice + " da parte dell'utente " + u1.nome + " " + u1.cognome);
        }

        // 4. Simulazione fine noleggio
        if (!m1.disponibile) {
            System.out.println("Fine corsa...");

            // il monopattino ritorna disponibile e il livello di batteria si abbassa
            m1.disponibile = true;
            m1.scaricaBatteria();
            
            boolean pagamentoRiuscito = u1.scalaCredito(1.0); // Costa 1 euro
        }

        // 5. Verifica stato finale
        System.out.println(m1.visualizzaDati());
        System.out.println("Credito residuo dell'utente: " + u1.credito);
    }
}