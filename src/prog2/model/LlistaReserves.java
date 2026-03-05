package prog2.model;

import prog2.vista.ExcepcioReserva;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;

public class LlistaReserves implements InLlistaReserves{
    // Atributs de LlistaReserves
    private ArrayList<Reserva> reserves_;

    // Constructor
    public LlistaReserves(){
        this.reserves_ = new ArrayList<>();
    }

    // Mètodes de LlistaReserves
    /**
     * Comprova que l'estada es mes llarga o igual que l'estada mínima
     * @param allotjament_
     * @param dataEntrada_
     * @param dataSortida_
     *
     */
    public boolean isEstadaMinima(Allotjament allotjament_, LocalDate dataEntrada_, LocalDate dataSortida_) {
        boolean estadaCorrecte = false;
        long estadaMin = ChronoUnit.DAYS.between(dataEntrada_, dataSortida_);
        if (estadaMin >= allotjament_.getEstadaMinima(Camping.getTemporada(dataEntrada_))) {
            estadaCorrecte = true;
        }
        return estadaCorrecte;
    }

    /**
     * Comprova que l'allotjament estigui disponible pels dies indicats
     * @param allotjament_
     * @param dataEntrada_
     * @param dataSortida_
     *
     */
    public boolean isAllotjamentDisponible(Allotjament allotjament_, LocalDate dataEntrada_, LocalDate dataSortida_) {
        boolean disponible = true;
        Iterator<Reserva> itrReserves = this.reserves_.iterator();
        while (itrReserves.hasNext() && disponible) {
            Reserva r = itrReserves.next();
            if(r.getAllotjament_().getId().equals(allotjament_.getId())){
                if(!(r.getDataEntrada().isAfter(dataSortida_)) || !(r.getDataSortida().isBefore(dataEntrada_))){
                    disponible = false;
                }
            }
        }
        return disponible;
    }

    /**
     * Comprova que l'estada que es demani sigui més llarga o igual que l'estada mínima.
     * Comprova que l'allotjament estigui disponible pels dies indicats.
     * En cas afirmatiu, crea la reserva i l’afegeix a la llista de reserves del camping.
     * En cas negatiu, llança una excepció de tipus ExceptionReserva amb el missatge d'error.
     *
     * @param allotjament
     * @param client
     * @param dataEntrada
     * @param dataSortida
     * @throws ExcepcioReserva
     */
    @Override
    public void afegirReserva(Allotjament allotjament, Client client, LocalDate dataEntrada, LocalDate dataSortida) throws ExcepcioReserva {
        if (!isEstadaMinima(allotjament, dataEntrada, dataSortida)) {
            throw new ExcepcioReserva("No es compleix l'estada mínima establerta.");
        }
        if (!isAllotjamentDisponible(allotjament, dataEntrada, dataSortida)) {
            throw new ExcepcioReserva("L'allotjament no està disponible en les dates introduïdes.");
        }
        // En cas de que no hi hagi excepció:
        Reserva nouReserva = new Reserva(allotjament, client, dataEntrada, dataSortida);
        this.reserves_.add(nouReserva);
    }

    /**
     * Retorna el número de reserves de la llista.
     *
     * @return el número de reserves.
     */
    @Override
    public int getNumReserves() {
        return this.reserves_.size();
    }
}
