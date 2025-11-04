public class App {
    public static void main(String[] args) throws Exception {

        //dichiaro un oggetto istanza della classe Auto
        Auto bravo;
        //allocazione dell'oggetto bravo mediante il suo costruttore
        bravo = new Auto();
        bravo.marca = "Fiat";
        bravo.modello = "Bravo";
        bravo.velocita = 0;
        bravo.frenoAMano = true;
        bravo.accesa = false;
       
        //CREO UN NUOVO PILOTA
        Persona luca = new Persona();
        luca.nome = "Luca";
        luca.cognome = "Melcarne";
        luca.annoNascita = 1991;

        //ASSOCIAMO LA PERSONA APPENA CREATA ALL'AUTO
        bravo.pilota = luca;

        //CREO UN NUOVO PILOTA
        Persona matteo = new Persona();
        matteo.nome = "Matteo";
        matteo.cognome = "Russo";
        matteo.annoNascita = 2010;




        bravo.accensione();
        System.out.println("L'auto è " + (bravo.accesa? "accesa" : "spenta"));
        
        /*
        bravo.spegnimento();
        System.out.println("L'auto è " + (bravo.accesa? "accesa" : "spenta"));
        */

        bravo.toggleFrenoAMano();
        System.out.println("Il freno a mano è " + (bravo.frenoAMano? "inserito" : "disinserito"));
        
        //INIZIO AD ACCELERARE FINO AD ARRIVARE A 100 KM/H
        //TODO: VIENE GENERATO UN LOOP INFINITO, NECESSARIO BUG FIXING 
        do {

            bravo.accelera(10);
            
            //Ad ogni incremento di velocità, la visualizzo in output
            System.out.println("velocità attuale: " + bravo.getVelocita());

        } while(bravo.getVelocita() <= 100 );

        // RAGGIUNTI GLI ALMENO 100KM/H, RALLENTO FINO A FERMARMI
        do {
            
            // Decremento la velocità fino a raggiungere lo 0
            bravo.frena();
            System.out.println("velocità attuale: " + bravo.getVelocita());

        }while(bravo.getVelocita() > 0);

        bravo.toggleFrenoAMano();
        System.out.println("Il freno a mano è " + (bravo.frenoAMano? "inserito" : "disinserito"));

        bravo.spegnimento();
        System.out.println("L'auto è " + (bravo.accesa? "accesa" : "spenta"));


    }
}