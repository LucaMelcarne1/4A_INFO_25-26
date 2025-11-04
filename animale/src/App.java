public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        

        //Creo un oggetto animale
        Animale cane1= new Animale(); //l'oggetto cane1 è un oggetto vuoto
        cane1.specie="cane";
        cane1.razza="pastore tedesco";
        cane1.eta=3;

        //creo un oggetto animale2 con il costruttore con tutti i parametri
        Animale gatto1= new Animale("gatto","siamese",2);
        System.out.println("Il mio animale è un "+cane1.specie+" di razza "+cane1.razza+" di età "+cane1.eta);
        System.out.println("Il mio animale è un "+gatto1.specie+" di razza "+gatto1.razza+" di età "+gatto1.eta);   
        cane1.verso();
        gatto1.verso(); 
        


            
    }
}
