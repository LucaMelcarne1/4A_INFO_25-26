public class Auto {
 
    String marca;
    String modello;
    double velocita;
    boolean frenoAMano;
    boolean accesa;

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

        if (accesa && !frenoAMano )
        {
            velocita += acc;
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