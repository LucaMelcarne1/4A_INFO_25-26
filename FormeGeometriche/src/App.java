/*
 * CLASSE APP
 * Contiene il flusso principale di esecuzione del programma.
 */
class App {

    /*
     * Metodo main.
     * È il punto di ingresso obbligatorio per le applicazioni Java.
     * (Nota: 'public' qui è necessario per lo standard di avvio di Java, 
     * ma per il resto del codice non è stato usato alcun modificatore).
     */
    public static void main(String[] args) {

        System.out.println("--- INIZIO CALCOLO QUADRATO ---");

        // ---------------------------------------------------------
        // 1. CREAZIONE OGGETTO
        // ---------------------------------------------------------
        
        // Impostiamo una variabile con la lunghezza del lato desiderata (es. 10.5).
        double lunghezzaLato = 10.5;

        /*
         * Creiamo un nuovo oggetto di tipo Quadrato.
         * Chiamiamo il costruttore passando la 'lunghezzaLato'.
         */
        Quadrato q = new Quadrato(lunghezzaLato);

        // Stampiamo a video il lato che abbiamo scelto.
        System.out.println("Lato del quadrato: " + lunghezzaLato);

        // ---------------------------------------------------------
        // 2. USO DEI METODI
        // ---------------------------------------------------------

        /*
         * Invochiamo il metodo 'area()' sull'oggetto 'q'.
         * Il calcolo viene eseguito nella classe Quadrato e il risultato torna qui.
         */
        double valoreArea = q.area();

        /*
         * Invochiamo il metodo 'perimetro()' sull'oggetto 'q'.
         * Il risultato viene salvato nella variabile 'valorePerimetro'.
         */
        double valorePerimetro = q.perimetro();

        // ---------------------------------------------------------
        // 3. OUTPUT
        // ---------------------------------------------------------
        
        // Visualizziamo i risultati finali.
        System.out.println("Area calcolata: " + valoreArea);
        System.out.println("Perimetro calcolato: " + valorePerimetro);
        
        System.out.println("--- FINE ---");
    }
}
