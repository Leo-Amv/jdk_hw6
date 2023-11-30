package ru.gb;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] doors = {0,0,0};
        int count = 100;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            int indexCar = rand.nextInt(3);
            doors[indexCar] = 1;
            System.out.println("|_1_| |_2_| |_3_|\nSelect door (1-3):");
            int choice = sc.nextInt()-1;
            System.out.printf("Your choice is: %d door\n",choice + 1);
            int space= 0;
            while (space == choice || space == indexCar){
                space = rand.nextInt(3);
            }
            System.out.printf("Space in door: %d , do you want to select another door ? (1-3):\n ",space + 1);
            choice = sc.nextInt()-1;
            if (choice == indexCar){
                System.out.printf("You win! Car in %d, choice is %d\n",indexCar+1,choice+1);
            }else {
                System.out.printf("You fail! Car in %d, choice is %d\n",indexCar+1,choice+1);
            }
            doors = new int[]{0, 0, 0};
        }
    }
}