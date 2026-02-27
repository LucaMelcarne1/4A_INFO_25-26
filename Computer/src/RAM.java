public class RAM {
    private int capacitaGB;
    private int memoriaInUsoGB;

    public RAM(int capacitaGB) {
        this.capacitaGB = capacitaGB;
        // Inizializziamo la memoria in uso a zero quando la RAM viene "comprata" e creata.
        this.memoriaInUsoGB = 0; 
    }

    // Questo metodo simula l'occupazione della memoria e include un controllo logico
    // per evitare che si superi la capacità fisica, un ottimo esempio di 
    // come un oggetto protegge e gestisce il proprio stato interno.
    public void caricaDati(int quantitaGB) {
        if (memoriaInUsoGB + quantitaGB <= capacitaGB) {
            memoriaInUsoGB += quantitaGB;
            System.out.println("[RAM] Caricati " + quantitaGB + "GB. Memoria in uso: " + memoriaInUsoGB + "/" + capacitaGB + "GB.");
        } else {
            System.out.println("[RAM] Errore: Memoria insufficiente! (Out of Memory)");
        }
    }

    // Metodo per resettare lo stato interno dell'oggetto
    public void liberaMemoria() {
        memoriaInUsoGB = 0;
        System.out.println("[RAM] Memoria svuotata completamente.");
    }
}