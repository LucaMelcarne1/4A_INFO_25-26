/*
 * CLASSE APP
 * Punto di avvio del programma.
 * Mostra come popolare gli oggetti quando si usa il costruttore di default.
 */
class App {

    public static void main(String[] args) {

        System.out.println("--- PREVENTIVO ---");

        // ---------------------------------------------------------
        // 1. GESTIONE OGGETTO PARETE
        // ---------------------------------------------------------

        /*
         * PASSO A: Creazione (Istanziazione).
         * Usiamo 'new Parete()' per creare una nuova parete, che ancora non ha valori per larghezza e altezza: bisogna assegnarli successivamente.
         */
        Parete miaParete = new Parete();

        /*
         * PASSO B: Popolamento dati.
         * Accediamo direttamente agli attributi con il punto (dot notation)
         * e assegniamo i valori desiderati.
         */
        miaParete.larghezza = 4.0;
        miaParete.altezza = 3.0;
        
        System.out.println("Parete configurata: 4.0 x 3.0 metri.");


        // ---------------------------------------------------------
        // 2. GESTIONE OGGETTO VERNICE
        // ---------------------------------------------------------

        /*
         * PASSO A: Creazione.
         * Creiamo l'oggetto vernice vuoto. Il prezzo è momentaneamente 0.0.
         */
        Vernice vernicePremium = new Vernice();

        /*
         * PASSO B: Popolamento dati.
         * Assegniamo il costo al metro quadro.
         */
        vernicePremium.prezzoAlMq = 12.50;

        System.out.println("Vernice configurata: 12.50 euro al mq.");


        // ---------------------------------------------------------
        // 3. INTERAZIONE E CALCOLO (Identico a prima)
        // ---------------------------------------------------------

        /*
         * Ora che gli oggetti sono pieni di dati, possiamo usarne i metodi.
         * Chiediamo alla parete di calcolare la sua area.
         */
        double superficieReale = miaParete.calcolaSuperficie();
        System.out.println("Superficie calcolata: " + superficieReale + " mq");

        /*
         * Passiamo la superficie alla vernice per avere il prezzo finale.
         */
        double costoTotale = vernicePremium.preventivo(superficieReale);

        // ---------------------------------------------------------
        // 4. OUTPUT
        // ---------------------------------------------------------

        System.out.println("Costo totale preventivato: " + costoTotale + " euro");
        System.out.println("--- FINE ---");
    }
}