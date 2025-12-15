/*
 * CLASSE QUADRATO
 * Rappresenta l'oggetto descritto nel diagramma UML.
 * Non sono specificati livelli di visibilità, quindi l'accesso è di default.
 */
class Quadrato {

    // ---------------------------------------------------------
    // ATTRIBUTI
    // ---------------------------------------------------------

    /*
     * Variabile 'lato': contiene la lunghezza del lato del quadrato.
     * Tipo 'double' per gestire anche numeri con la virgola.
     */
    double lato;

    // ---------------------------------------------------------
    // COSTRUTTORE
    // ---------------------------------------------------------

    /*
     * Costruttore della classe.
     * Serve a creare un nuovo Quadrato assegnandogli subito una dimensione.
     *
     * @param latoIniziale: il valore numerico da assegnare al lato.
     */
    Quadrato(double latoIniziale) {
        // Assegniamo il valore passato tra parentesi alla variabile dell'oggetto.
        this.lato = latoIniziale;
    }

    // ---------------------------------------------------------
    // METODI
    // ---------------------------------------------------------

    /*
     * Metodo 'area': calcola la superficie del quadrato.
     * Restituisce un valore di tipo double.
     */
    double area() {
        // Logica: Moltiplica il lato per se stesso.
        double risultato = lato * lato;
        
        // Ritorna il risultato al chiamante.
        return risultato;
    }

    /*
     * Metodo 'perimetro': calcola il contorno del quadrato.
     * Restituisce un valore di tipo double.
     */
    double perimetro() {
        // Logica: Moltiplica il lato per 4.
        double risultato = lato * 4;
        
        // Ritorna il risultato al chiamante.
        return risultato;
    }
}
