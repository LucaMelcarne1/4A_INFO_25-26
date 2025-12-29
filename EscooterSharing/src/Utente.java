public class Utente {
   
    // Attributi
    String nome;
    String cognome;
    double credito;


    //Metodi
    public void ricaricaCredito(double soldi) {
        this.credito += soldi;
    }

    // Restituisce true se ha pagato, false se non ha soldi
    public boolean scalaCredito(double importo) {
        if (this.credito >= importo) {
            this.credito -= importo;
            return true;
        } else {
            System.out.println("Credito insufficiente!");
            return false;
        }
    }
}