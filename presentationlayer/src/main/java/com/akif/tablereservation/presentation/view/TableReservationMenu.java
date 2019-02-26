package com.akif.tablereservation.presentation.view;

import com.akif.tablereservation.business.ReservationService;
import com.akif.tablereservation.business.Service;
import com.akif.tablereservation.presentation.input.Input;
import com.akif.tablereservation.presentation.input.InputHandler;
import com.akif.tablereservation.presentation.input.validation.ValidationType;

public class TableReservationMenu implements Menu {

    private ReservationService service;
    private Input inputHandler;

    public TableReservationMenu() {
        this.service = new Service();
        this.inputHandler = new InputHandler();
    }

    public void showMenu() {
        System.out.println("**********************");
        System.out.println("Willkommen bei Useless-Reservator");
        System.out.println();
        System.out.println("1. Reservierung erstellen");
        System.out.println("2. Reservierungen anzeigen");
        System.out.println("9. Programm beenden");

        int a = inputHandler.getInt(ValidationType.SELECTION);

        switch (a) {
            case 1:
                makeReservation();
                break;
            case 2:
                showReservations();
                break;
            case 9:
                return;
            default:
                System.out.println("something went wrong");
                showMenu();
        }
    }

    private void makeReservation() {
        System.out.println();
        System.out.println("***************************");
        System.out.println();
        System.out.println("Geben sie den Namen ein");
        String name = inputHandler.getString(ValidationType.NAME);
        System.out.println("Geben sie die Anzahl der Personen ein");
        int personen = inputHandler.getInt(ValidationType.PERSONS);
        System.out.println("Geben sie die Tischnummer ein");
        int tischnummer = inputHandler.getInt(ValidationType.TABLENUMBER);
        System.out.println("Geben sie das Reservierungsdatum ein");
        String datum = inputHandler.getString(ValidationType.DATE);
        System.out.println("Geben sie die Reservierungszeit ein");
        Double zeit = inputHandler.getDouble(ValidationType.TIME);
        service.saveReservation(name, datum, zeit, personen, tischnummer);
    }

    private void showReservations() {
        for (com.project.akif.Reservation reservation : service.getAllReservations()) {
            System.out.println(reservation);
        }
    }

}
