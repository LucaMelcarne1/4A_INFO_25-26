/*
 * CLASSE PARETE
 * Rappresenta l'oggetto fisico.
 */
class Parete {

    // ---------------------------------------------------------
    // ATTRIBUTI
    // ---------------------------------------------------------
    
    /*
     * Variabili che conterranno le dimensioni.
     * Quando l'oggetto viene creato col costruttore di default,
     * queste variabili partono da 0.0 finché non le modifichiamo noi.
     */
    double larghezza;
    double altezza;

    // ---------------------------------------------------------
    // METODI
    // ---------------------------------------------------------

    /*
     * Metodo per il calcolo dell'area.
     * Funziona esattamente come prima: legge i valori attuali
     * di larghezza e altezza e restituisce il prodotto.
     */
    double calcolaSuperficie() {
        double mq = larghezza * altezza;
        return mq;
    }
}