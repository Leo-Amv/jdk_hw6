package ru.gb;

import java.util.Random;

public class Game {
    private static int[] doors;
    private static int indexCar;
    private static int choice;

    public static void start(){
        doors = new int[]{0, 0, 0};
        indexCar = new Random().nextInt(3);
        doors[indexCar] = 1;
        UI ui = new UI();
        ui.showDoors();
        choice = ui.checkChoice();
        ui.showGoat(choice,indexCar);
        choice = ui.checkChoice();
        ui.checkWin(choice,indexCar);
        ui.showDoors();
    }

}
