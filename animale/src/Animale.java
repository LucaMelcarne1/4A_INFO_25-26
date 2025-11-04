public class Animale {
    //Attributi
    String specie;
    String razza;   
    int eta;    

    //costruttore vuoto di default
    public Animale() {
    }

    //costruttore con due parametri
    public Animale(String specie, String razza) {
        this.specie = specie;
        this.razza = razza;
    }   

    //costruttore con tutti i parametri
    public Animale(String specie, String razza, int eta) {
        this.specie = specie;
        this.razza = razza;
        this.eta = eta;
    }
    //metodi
    void verso() {  
        System.out.println("L'animale fa un verso");
    }
}

