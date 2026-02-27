public class Computer {
    // COMPOSIZIONE (Has-A Relationship): 
    // Il Computer non è una singola entità semplice, ma è composto 
    // da altri oggetti complessi. Come attributi usiamo i Tipi delle classi create.
    private CPU processore;
    private RAM memoria;
    private MemoriaDiMassa disco;
    private Tastiera tastiera;
    private Monitor monitor;
    
    // Attributo primitivo per gestire lo stato del computer
    private boolean acceso;

    // Il costruttore richiede che vengano passati oggetti già istanziati.
    // Stiamo letteralmente "assemblando" il PC passando i vari componenti.
    public Computer(CPU cpu, RAM ram, MemoriaDiMassa disco, Tastiera tastiera, Monitor monitor) {
        this.processore = cpu;
        this.memoria = ram;
        this.disco = disco;
        this.tastiera = tastiera;
        this.monitor = monitor;
        this.acceso = false; // Di default il computer appena assemblato è spento
    }

    // Metodo che modifica lo stato (acceso diventa true) e fa interagire 
    // i componenti interni delegando a loro le operazioni.
    public void accendi() {
        if (!acceso) {
            acceso = true;
            monitor.mostraVideo("Avvio del sistema in corso...");
            memoria.caricaDati(2); // Deleghiamo alla RAM l'azione di caricarsi
            System.out.println(">>> Computer acceso e pronto all'uso.");
        } else {
            System.out.println("Il computer è già acceso.");
        }
    }

    public void spegni() {
        if (acceso) {
            monitor.mostraVideo("Spegnimento in corso...");
            memoria.liberaMemoria(); // Deleghiamo alla RAM lo svuotamento
            acceso = false;
            System.out.println(">>> Computer spento.");
        }
    }

    // Questo metodo è il cuore della simulazione: mostra come gli oggetti
    // comunicano tra di loro all'interno della classe che li contiene.
    public void eseguiOperazioneSimulata() {
        // Controllo dello stato: se il PC è spento, blocca l'esecuzione
        if (!acceso) {
            System.out.println("Errore: devi prima accendere il computer!");
            return; // Termina il metodo prematuramente
        }

        // 1. Otteniamo l'input dalla tastiera e lo salviamo in una variabile
        String input = tastiera.digitaInput();
        
        // 2. Simuliamo la lettura dal disco
        disco.leggiFile("programma.exe");
        
        // 3. Simuliamo il caricamento in memoria RAM del programma
        memoria.caricaDati(1);
        
        // 4. Passiamo l'input dell'utente al processore per l'elaborazione
        processore.elaboraDati(input);
        
        // 5. Comunichiamo il risultato tramite il monitor
        monitor.mostraVideo("Elaborazione terminata con successo!");
    }
}