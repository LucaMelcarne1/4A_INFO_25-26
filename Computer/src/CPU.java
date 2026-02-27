public class CPU {
    
    // INCAPSULAMENTO: Gli attributi sono 'private' per nascondere 
    // lo stato interno dell'oggetto all'esterno. Possono essere 
    // modificati o letti solo tramite metodi appropriati (se previsti).

    private String modello;
    private double frequenzaGHz;

    // COSTRUTTORE: Metodo speciale chiamato al momento della creazione 
    // dell'oggetto (tramite 'new'). Serve a inizializzare gli attributi.

    public CPU(String modello, double frequenzaGHz) {
        // La parola chiave 'this' serve a distinguere l'attributo 
        // della classe (this.modello) dal parametro passato (modello).
        
        this.modello = modello;
        this.frequenzaGHz = frequenzaGHz;
    }

    // METODO: Definisce un comportamento dell'oggetto CPU.
    
    public void elaboraDati(String dati) {
        System.out.println("[CPU " + modello + "] Sto elaborando i dati: " + dati);
    }
}