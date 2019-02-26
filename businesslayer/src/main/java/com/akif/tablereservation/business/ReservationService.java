package com.akif.tablereservation.business;

import java.util.List;

import com.project.akif.Reservation;

public interface ReservationService {
    List<Reservation> getAllReservations();
    boolean saveReservation(String name, String date, double time, int persons, int tableNumber);
}
