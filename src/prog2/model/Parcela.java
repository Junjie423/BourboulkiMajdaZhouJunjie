package prog2.model;

public class Parcela extends Allotjament{
    // Atributs de Parcela
    private float metres;
    private boolean connexioElectrica;

    // Constructor
    public Parcela(String nom, String id, float metres, boolean connexioElectrica) {
        super(nom, id,4,2);
        this.metres = metres;
        this.connexioElectrica = connexioElectrica;
    }

    // Mètodes de Parcela
    /**
     * Obté la mida de la parcela
     *
     * @return mida de la parcela
     */
    public float getMida() {
        return this.metres;
    }

    /**
     * Estableix la mida de la parcela
     * @param metres_
     *
     */
    public void setMida(float metres_) {
        this.metres= metres_;
    }

    /**
     * Comprova si té connexió electrica
     *
     * @return conexioElectrica
     */
    public boolean isConnexioElectrica() {
        return this.connexioElectrica;
    }

    /**
     * Estableix la connexió electrica de la parcela
     * @param connexioElectrica_
     *
     */
    public void setConnexioElectrica(boolean connexioElectrica_) {
        this.connexioElectrica= connexioElectrica_;
    }

    /**
     * Comprova que la Parcela tingui un funcionament correcte.
     *
     * @return funcionament de la Parcela.
     */
    @Override
    public boolean correcteFuncionament() {
        if(this.connexioElectrica){
            return true;
        } else{
            return false;
        }
    }

    /**
     * Imprimeix tota la informació de l'allotjament
     *
     * @return info
     */
    public String toString(){
        String info = super.toString();
        info += " Parcela{mida=" + this.metres + ", connexioElectrica=" + this.connexioElectrica + "}";

        return info;
    }
}
