public class App {
    // METODO MAIN: Il punto di partenza del nostro programma Java.
    public static void main(String[] args) {
       
        System.out.println("--- ASSEMBLAGGIO DEL COMPUTER ---\n");

        // ISTANZIAZIONE DEGLI OGGETTI:
        // Usiamo la parola chiave 'new' seguita dal Costruttore per 
        // creare gli oggetti concreti a partire dalle classi (i "progetti").
        
        CPU miaCpu = new CPU("Intel Core i7", 3.8);
        RAM miaRam = new RAM(16);
        MemoriaDiMassa mioSsd = new MemoriaDiMassa("SSD NVMe", 512);
        Tastiera miaTastiera = new Tastiera("QWERTY ITA");
        Monitor mioMonitor = new Monitor(24, "1920x1080");

        // COMPOSIZIONE IN AZIONE:
        // Creiamo l'oggetto 'Computer' passandogli le istanze appena create.
        // I riferimenti a questi oggetti vengono copiati dentro 'mioPC'.
        Computer mioPC = new Computer(miaCpu, miaRam, mioSsd, miaTastiera, mioMonitor);

        System.out.println("\n--- SIMULAZIONE FUNZIONAMENTO ---\n");

        // Proviamo a usare il PC mentre è spento per testare il controllo dello stato
        mioPC.eseguiOperazioneSimulata(); 
        
        System.out.println();
        
        // Accendiamo il PC. Questo cambierà il suo stato interno.
        mioPC.accendi();
        
        System.out.println();
        
        // Ora l'operazione andrà a buon fine mettendo in moto tutti i componenti
        mioPC.eseguiOperazioneSimulata();
        
        System.out.println();
        
        // Spegniamo il PC per concludere la simulazione
        mioPC.spegni();
    }
}