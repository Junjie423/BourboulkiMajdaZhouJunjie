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
        String info = "";

        return info;
    }
}
