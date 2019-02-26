package com.akif.tablereservation.persistence.model.repository;

import com.project.akif.Reservation;

import java.util.ArrayList;
import java.util.List;

public class ReservationRepository implements Repository {

    private List<Reservation> reservations;

    private static Repository instance = new ReservationRepository();

    private ReservationRepository() {
        reservations = new ArrayList<>();
    }

    public static Repository getInstance() {
        return instance;
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservations;
    }

    @Override
    public void saveReservation(Reservation reservation) {
        reservations.add(reservation);
    }
}
