package com.akif.tablereservation;

import com.akif.tablereservation.presentation.view.Menu;
import com.akif.tablereservation.presentation.view.TableReservationMenu;

/**
 * Hello world!
 */
public class App implements startApp {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Override
    public void start() {
        Menu menu = new TableReservationMenu();
        while (true) {
            menu.showMenu();
        }
    }
}
