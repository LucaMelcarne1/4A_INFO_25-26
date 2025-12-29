/*
 * CLASSE VERNICE
 * Rappresenta il materiale.
 */
class Vernice {

    // ---------------------------------------------------------
    // ATTRIBUTI
    // ---------------------------------------------------------

    /*
     * Variabile per il costo al metro quadro.
     * Sarà impostata manualmente nel main.
     */
    double prezzoAlMq;

    // ---------------------------------------------------------
    // METODI
    // ---------------------------------------------------------

    /*
     * Metodo per il preventivo.
     * Moltiplica i metri quadri ricevuti per il prezzo memorizzato nell'attributo.
     */
    double preventivo(double metriQuadriDaCoprire) {
        double totale = metriQuadriDaCoprire * prezzoAlMq;
        return totale;
    }
}