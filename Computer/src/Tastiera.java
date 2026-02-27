public class Tastiera {
    private String layout;

    public Tastiera(String layout) {
        this.layout = layout;
    }

    // A differenza dei metodi 'void' visti finora, questo metodo 
    // RESTITUISCE un valore (String). Simula l'azione dell'utente 
    // che digita qualcosa e lo invia al sistema.
    public String digitaInput() {
        System.out.println("[Tastiera " + layout + "] Inserimento input da parte dell'utente...");
        return "ComandoUtente_EseguiProgramma";
    }
}