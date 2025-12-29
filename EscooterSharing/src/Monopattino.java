class Monopattino {
    
    // Attributi
    String codice;
    int batteria;
    boolean disponibile;

    // Metodi
    void scaricaBatteria() {
        // il livello di carica scende del 20%
        this.batteria = this.batteria - 20;
        
        // meccanismo di controllo: se il livello id carica scende al di sotto dello zero, viene riportato a zero
        if (this.batteria < 0) this.batteria = 0;
    }

    // Serve a visualizzare lo stato del monopattino
    String visualizzaDati() {
        return "Codice monopattino " + codice + " - Batt: " + batteria + "% - In uso: " + disponibile;
    }
}