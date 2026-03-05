package prog2.model;

public class BungalowPremium extends Bungalow{
    // Atributs de BungalowPremium
    private String codiWifi;
    private boolean serveiExtra;

    // Constructor
    public BungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi){
        super(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        this.serveiExtra = serveisExtra;
        this.codiWifi = codiWifi;
    }

    // Mètodes de BungalowPremium
    /**
     * Obté el codiWifi
     *
     * @return string codiWifi
     */
    public String getcodiWifi() {
        return this.codiWifi;
    }

    /**
     * Estableix el codiWifi
     * @param codiWifi_
     *
     */
    public void setPlacesParquing(String codiWifi_) {
        this.codiWifi = codiWifi_;
    }

    /**
     * Comprova si té serveiExtra
     *
     * @return serveiExtra
     */
    public boolean isServeiExtra() {
        return this.serveiExtra;
    }

    /**
     * Estableix serveiExtra
     * @param serveiExtra_
     *
     */
    public void setServeiExtra(boolean serveiExtra_) {
        this.serveiExtra = serveiExtra_;
    }

    /**
     * Comprova que el BungalowPremium tingui un funcionament correcte.
     *
     * @return funcionament del BungalowPremium.
     */
    @Override
    public boolean correcteFuncionament() {

        boolean funcionament = super.correcteFuncionament();
        if(codiWifi.length() >= 8 && codiWifi.length() <= 16) {
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
        info += " BungalowPremium{serveiExtra=" + this.serveiExtra + ", codiWifi=" + this.codiWifi + "}";
        return info;
    }
}
