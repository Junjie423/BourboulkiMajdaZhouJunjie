package prog2.model;

public class Glamping extends Casa{
    // Atributs de Glamping
    private String material;
    private boolean casaMascota;

    // Constructor
    public Glamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, String material, boolean casaMascota){
        super(nom_, idAllotjament_, 3, 3, mida, habitacions, placesPersones);
        this.material = material;
        this.casaMascota = casaMascota;
    }

    // Mètodes de Glamping
    /**
     * Comprova que el Glamping tingui un funcionament correcte.
     *
     * @return funcionament del Glamping.
     */
    @Override
    public boolean correcteFuncionament() {
        boolean funcionament = false;
        if (this.casaMascota){
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
        info += " Glamping{material=" + this.material + ", casaMascota=" + this.casaMascota + "}";
        return info;
    }
}
