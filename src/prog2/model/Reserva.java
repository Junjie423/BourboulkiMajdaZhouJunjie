package prog2.model;

import java.time.LocalDate;

public class Reserva implements InReserva {
    // Atributs de reserva
    private Allotjament allotjament;
    private Client client;
    private LocalDate dataEntrada;
    private LocalDate dataSortida;
    // Constructor
    public Reserva(Allotjament allotjament_, Client client_, LocalDate dataEntrada, LocalDate dataSortida){
        this.allotjament = allotjament_;
        this.client = client_;
        this.dataEntrada = dataEntrada;
        this.dataSortida = dataSortida;
    }

    // Mètodes de Reserva
    /**
     * Obté l'allotjament
     *
     * @return allotjament
     */
    @Override
    public Allotjament getAllotjament_() {
        return this.allotjament;
    }

    /**
     * Obté el client
     *
     * @return client
     */
    @Override
    public Client getClient() {
        return this.client;
    }

    /**
     * Obté la data d'entrada
     *
     * @return dataEntrada
     */
    @Override
    public LocalDate getDataEntrada() {
        return this.dataEntrada;
    }

    /**
     * Obté la data de sortida
     *
     * @return dataSortida
     */
    @Override
    public LocalDate getDataSortida() {
        return this.dataSortida;
    }

    /**
     * Estableix l'allotjament
     * @param allotjament_
     *
     */
    @Override
    public void setAllotjament_(Allotjament allotjament_) {
        this.allotjament = allotjament_;
    }

    /**
     * Estableix el client
     * @param client_
     *
     */
    @Override
    public void setClient(Client client_) {
        this.client = client_;
    }

    /**
     * Estableix la data d'entrada
     * @param dataEntrada_
     *
     */
    @Override
    public void setDataEntrada(LocalDate dataEntrada_) {
        this.dataEntrada = dataEntrada_;
    }

    /**
     * Estableix la data de sortida
     * @param dataSortida_
     *
     */
    @Override
    public void setDataSortida(LocalDate dataSortida_) {
        this.dataSortida = dataSortida_;
    }
}
