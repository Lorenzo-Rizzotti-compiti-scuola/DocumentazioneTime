package codes.dreaming;

/**
 * La classe rappresenta e gestisce dati di tipo temporale.
 */
public class Time {
    // Fields
    protected int ore; // numero di ore dell'oggetto Time
    protected int minuti; // numero di minuti dell'oggetto Time
    protected int secondi; // numero di secondi dell'oggetto Time

    // Constructors
    /**
     * Costruisce un oggetto Time dato in ingresso ore, minuti e secondi.
     * Se i parametri di ingresso non sono validi (es. minuti 78) allora l'oggetto Time verrà inizializzato con tutti ore, minuti e secondi impostati a 0.
     */
    public Time(int ore, int minuti, int secondi) {
        if (ore >= 0 && minuti >= 0 && minuti < 60 && secondi >= 0 && secondi < 60) {
            this.ore = ore;
            this.minuti = minuti;
            this.secondi = secondi;
        } else {
            this.ore = 0;
            this.minuti = 0;
            this.secondi = 0;
        }
    }

    /**
     * Costruisce un oggetto Time dato in ingresso il numero di secondi.
     * Vengono distribuite in automatico i secondi tra le ore, minuti e secondi.
     * Esempio: se in input viene passato 100 allora ora 0, minuti 1 e secondi 40
     */
    public Time(int secondi) {
        if (secondi >= 0) {
            this.addSecondi(secondi);
        } else {
            this.ore = 0;
            this.minuti = 0;
            this.secondi = 0;
        }
    }

    // Methods
    public int getOre() {
        return ore;
    }

    @Deprecated
    public void setOre(int ore) {
        throw new UnsupportedOperationException("Deprecated method");
    }

    public int getMinuti() {
        return minuti;
    }

    @Deprecated
    public void setMinuti(int minuti) {
        throw new UnsupportedOperationException("Deprecated method");
    }

    public int getSecondi() {
        return secondi;
    }

    @Deprecated
    public void setSecondi(int secondi) {
        throw new UnsupportedOperationException("Deprecated method");
    }

    /**
     * Esprime le ore, i minuti e i secondi dell'oggetto Time in secondi.
     * Esempio. 1 ora, 20 min, 10 secondi -> 4810s
     */
    public int convertiSecondi() {
        return ore * 3600 + minuti * 60 + secondi;
    }

    /**
     * Vengono addizionati il numero di secondi specificati.
     * Il tempo viene normalizzato in automatico.
     */
    public void addSecondi(int secondi) {
        if (secondi >= 0) {
            this.secondi += secondi;
            this.minuti += this.secondi / 60;
            this.secondi %= 60;
            this.ore += this.minuti / 60;
            this.minuti %= 60;
        }
    }

    /**
     * Restituisce una stringa che rappresenta l'oggetto
     */
    public String toString() {
        return String.format("%02d:%02d:%02d", ore, minuti, secondi);
    }
}