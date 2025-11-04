public class Auto {
 
    String marca;
    String modello;
    double velocita;
    boolean frenoAMano;
    boolean accesa;
    Persona pilota;

    void accensione(){

        if(!accesa)
        {
            accesa = true;
        }
    }

    void toggleFrenoAMano() {

        frenoAMano = !frenoAMano;

    }

    void spegnimento(){

        if(accesa)
        {
            accesa = false;
        }
    }

    void accelera(double acc){

        if (accesa && !frenoAMano && pilota.calcolaEta(2025) >= 18)
        {
            velocita += acc;
        }
        else if(pilota.calcolaEta(2025) < 18) {
            System.out.println("il pilota è minorenne");
        } else {
            System.out.println("l'auto è spenta oppure ha il freno a mano attivato");

        }
    }

    void frena() {

        if (velocita >= 5) {
            velocita -= 3;
        } else if (velocita >= 1 ) {
            velocita -= 1;
        } else {
            velocita = 0;
        }

    }

    double getVelocita() {
        return velocita;
    }

}