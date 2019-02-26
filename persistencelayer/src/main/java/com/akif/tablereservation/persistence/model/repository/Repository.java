package com.akif.tablereservation.persistence.model.repository;

import java.util.List;

public interface Repository {
    List<com.project.akif.Reservation> getAllReservations();
    void saveReservation(com.project.akif.Reservation reservation);
}
