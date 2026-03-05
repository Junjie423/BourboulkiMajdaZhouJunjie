package prog2.model;

public class Bungalow extends Casa{
    // Atributs del Bungalow
    private int placesParquing;
    private boolean terrassa, tv, aireFred;

    // Constructor
    public Bungalow(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred){
        super(nom_,idAllotjament_, 7, 4, mida, habitacions, placesPersones);
        this.placesParquing = placesParquing;
        this.terrassa = terrassa;
        this.tv = tv;
        this.aireFred = aireFred;
    }

    // Mètodes de Bungalow
    /**
     * Obté el nombre de placesParquing
     *
     * @return nombre de placesParquing
     */
    public int getPlacesParquing() {
        return this.placesParquing;
    }

    /**
     * Estableix el nombre de placesParquing
     * @param placesParquing_
     *
     */
    public void setPlacesParquing(int placesParquing_) {
        this.placesParquing = placesParquing_;
    }

    /**
     * Comprova si té terrassa
     *
     * @return terrassa
     */
    public boolean isTerrassa() {
        return this.terrassa;
    }

    /**
     * Estableix terrassa
     * @param terrassa_
     *
     */
    public void setTerrassa(boolean terrassa_) {
        this.terrassa = terrassa_;
    }

    /**
     * Comprova si té tv
     *
     * @return tv
     */
    public boolean isTv() {
        return this.tv;
    }

    /**
     * Estableix tv
     * @param tv_
     *
     */
    public void setTv(boolean tv_) {
        this.tv = tv_;
    }

    /**
     * Comprova si té aireFred
     *
     * @return aireFred
     */
    public boolean isAireFred() {
        return this.aireFred;
    }

    /**
     * Estableix aireFred
     * @param aireFred_
     *
     */
    public void setAireFred(boolean aireFred_) {
        this.aireFred = aireFred_;
    }

    /**
     * Comprova que el Bungalow tingui un funcionament correcte.
     *
     * @return funcionament del Bungalow.
     */
    @Override
    public boolean correcteFuncionament() {
        boolean funcionament = false;
        if (this.aireFred){
            funcionament = true;
        }
        return funcionament;
    }

    /**
     * Imprimeix tota la informació de l'allotjament
     *
     * @return info
     */
    public String toString(){
        String info = super.toString();
        info += " Bungalow{placesParquing=" + this.placesParquing + ", terrassa=" + this.terrassa +  ", tv=" + this.tv + ", aireFred=" + this.aireFred + "}";
        return info;
    }
}
