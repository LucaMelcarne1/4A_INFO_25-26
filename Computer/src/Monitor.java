public class Monitor {
    private int pollici;
    private String risoluzione;

    public Monitor(int pollici, String risoluzione) {
        this.pollici = pollici;
        this.risoluzione = risoluzione;
    }

    public void mostraVideo(String messaggio) {
        System.out.println("[Monitor " + pollici + "\" " + risoluzione + "] A SCHERMO: " + messaggio);
    }
}