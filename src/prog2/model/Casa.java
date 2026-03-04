package prog2.model;

public abstract class Casa extends Allotjament{
    // Atributs de Casa
    private String mida;
    private int habitacions, placesPersones;

    // Constructor
    public Casa(String nom_, String id_, long estadaMinimaAlta, long estadaMinimaBaixa, String mida, int habitacions, int placesPersones) {
        super(nom_, id_, estadaMinimaAlta, estadaMinimaBaixa);
        this.mida = mida;
        this.habitacions = habitacions;
        this.placesPersones = placesPersones;
    }

    // Mètodes de Casa
    /**
     * Obté la mida de la casa
     *
     * @return la mida de la casa
     */
    public String getMida() {
        return mida;
    }

    /**
     * Estableix la mida de la casa
     * @param mida
     *
     */
    public void setMida(String mida) {
        this.mida = mida;
    }

    /**
     * Obté el número d'habitacions
     *
     * @return el número d'habitacions
     */
    public int getHabitacions() {
        return habitacions;
    }

    /**
     * Estableix el número d'habitacions de la casa
     * @param habitacions
     *
     */
    public void setHabitacions(int habitacions) {
        this.habitacions = habitacions;
    }

    /**
     * Obté la capacitat de places de persones
     *
     * @return la capacitat de places de persones
     */
    public int getPlacesPersones() {
        return placesPersones;
    }

    /**
     * Estableix la capacitat de places de persones
     * @param placesPersones
     *
     */
    public void setPlacesPersones(int placesPersones) {
        this.placesPersones = placesPersones;
    }
}
