package ru.gb;

import java.util.Random;
import java.util.Scanner;

public class UI {
    private final Scanner sc = new Scanner(System.in);
    private final String[] field;

    public UI() {
        this.field = new String[]{"|_1_|","|_2_|","|_3_|"};
    }

    public int checkChoice(){
        int choice = -1;
        try {
            System.out.println("Select door, please enter number 1-3:");
            choice = sc.nextInt() - 1;
            while (choice > 2 || choice < 0){
                System.out.println("Incorrect data,please enter number 1-3:");
                choice = sc.nextInt();
            }
        }catch (Exception e){
            System.out.println("Incorrect data,please enter number 1-3:");
        }
        System.out.printf("\nYour choice is: %d door\n",choice + 1);
        return choice;
    }
    public void showGoat(int choice,int indexCar){
        int goat = 0;
            while (goat == choice || goat == indexCar){
                goat = new Random().nextInt(3);
            }
        field[goat] = "|_goat_|";
        showDoors();
        System.out.printf("\nGoat in door: %d , do you want to select another door ? (1-3):\n ",goat + 1);
    }
    public void checkWin(int choice,int indexCar){
        setField(indexCar);
        if (choice == indexCar){
                System.out.printf("You win! Car in %d, choice is %d\n",indexCar+1,choice+1);
            }else {
                System.out.printf("You fail! Car in %d, choice is %d\n",indexCar+1,choice+1);
            }
    }
    public void setField(int indexCar){
        field[indexCar] = "|_car_|";
        for (int i = 0; i < field.length; i++) {
            if (!field[i].equals("|_car_|")){
                field[i] = "|_goat_|";
            }
        }
    }
    public void showDoors(){
        System.out.println("\n" + field[0] + " " + field[1] + " " + field[2]);
    }
}
