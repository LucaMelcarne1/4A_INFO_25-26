class Dado {
    int numeroEstratto;

    void estraiNumero() {
        numeroEstratto = (int)(Math.random() * 6) + 1;
    }

}