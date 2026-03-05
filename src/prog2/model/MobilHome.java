package prog2.model;

public class MobilHome extends Casa{
    // Atributs de MobilHome
    private boolean terrassaBarbacoa;

    // Constructor
    public MobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa){
        super(nom_, idAllotjament_, 5, 3, mida, habitacions, placesPersones);
        this.terrassaBarbacoa = terrassaBarbacoa;
    }

    // Mètodes de MobilHome
    /**
     * Comprova si té terrassaBarbacoa
     *
     * @return terrassaBarbacoa
     */
    public boolean isTerrassaBarbacoa() {
        return this.terrassaBarbacoa;
    }

    /**
     * Estableix terrassaBarbacoa
     * @param terrassaBarbacoa_
     *
     */
    public void setTerrassaBarbacoa(boolean terrassaBarbacoa_) {
        this.terrassaBarbacoa = terrassaBarbacoa_;
    }
    /**
     * Comprova que el MobilHome tingui un funcionament correcte.
     *
     * @return funcionament del MobilHome.
     */
    @Override
    public boolean correcteFuncionament() {
        boolean funcionament = false;
        if(this.terrassaBarbacoa){
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
        info += " MobilHome{terrassaBarbacoa=" + this.terrassaBarbacoa + "}";
        return info;
    }
}
