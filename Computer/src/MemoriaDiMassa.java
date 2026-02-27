public class MemoriaDiMassa {
    private String tipo; 
    private int capacitaGB;

    public MemoriaDiMassa(String tipo, int capacitaGB) {
        this.tipo = tipo;
        this.capacitaGB = capacitaGB;
    }

    // Metodo che accetta una stringa (il nome del file) per simulare un'operazione di I/O
    public void leggiFile(String nomeFile) {
        System.out.println("[" + tipo + "] Lettura del file '" + nomeFile + "' in corso...");
    }
}