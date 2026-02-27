public class App {
    public static void main(String[] args) throws Exception {
        
        Quadrato q1 = new Quadrato();
        q1.lato = 10;
        System.out.println("Il perimetro di q1 è: " + q1.perimetro());
        
        Quadrato q2 = new Quadrato(10);
        System.out.println("Il perimetro di q2 è: " + q2.perimetro());

    }
}
