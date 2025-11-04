public class Persona {
    String nome;
    String cognome;
    int annoNascita;
    
    int calcolaEta(int annoCorrente){
        return annoCorrente - annoNascita;
    }

}
