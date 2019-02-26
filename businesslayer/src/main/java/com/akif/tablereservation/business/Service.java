package com.akif.tablereservation.business;

import com.akif.tablereservation.persistence.model.repository.Repository;
import com.akif.tablereservation.persistence.model.repository.ReservationRepository;
import com.project.akif.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class Service implements ReservationService{
    private Repository repository;

    public Service() {
        repository= ReservationRepository.getInstance();
    }

    @Override
    public List<Reservation> getAllReservations() {
        return repository.getAllReservations();
    }

    @Override
    public boolean saveReservation(String name, String date, double time, int persons, int tableNumber) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            formatter.parse(date);
            Reservation reservation = new Reservation(name, tableNumber, persons, date, time);
            repository.saveReservation(reservation);
            return true;
        } catch(ParseException e) {
            System.err.println("Das Datum ist nicht richtig formatiert");
            return false;
        }
    }

}
