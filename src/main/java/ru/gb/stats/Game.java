package ru.gb.stats;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Game {

    boolean doors[];
    private static Map<Integer, Boolean> result = new HashMap<>();
    private static Random rand = new Random();

    /**
     * Метод для игры без изменения решения выьора
     * и считаем количество выигрышей
     *
     * @param number число экспериментов
     * @return количество выигрышей
     */
    static long checkOldChoice(long number) {
        long count = 0;
        for (int i = 0; i < number; i++) {
            boolean doors[] = hideСar();
            int userChoice = pick();

            if (doors[userChoice]) {
                count++;
            }
            result.put(i, doors[userChoice]);
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(i + " " + result.get(i));
        }
        return count;
    }

    private static boolean[] hideСar() {
        boolean doors[] = new boolean[]{false, false, false};
        doors[rand.nextInt(3)] = true;
        return doors;
    }

    /**
     * Случайное число прячет(выбирает) дверь, где расположена машина
     *
     * @return
     */
    private static int pick() {

        return rand.nextInt(3);
    }

    /**
     * Метод игры с изменением решений номер заданной дери
     * считаем количество выигранных автомобилей
     *
     * @param number число экспериментов
     * @return количество выигрышей
     */
    static long checkNewChoice(long number) {
        long count = 0;
        for (int i = 0; i < number; i++) {
            boolean doors[] = hideСar();
            int userChoice = pick();
            userChoice = secondPick(doors, userChoice);
            if (doors[userChoice]) {
                count++;
            }
            result.put(i, doors[userChoice]);
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(i + " " + result.get(i));
        }
        return count;
    }

    private static int secondPick(boolean[] doors, int userChoice) {
        int secondPick = rand.nextInt(3);
        if(doors[userChoice]){
            return secondPick;
        }
        while (secondPick == userChoice || !doors[secondPick]){
            secondPick = rand.nextInt(3);
        }
        if(doors[userChoice] && secondPick != userChoice){
            return secondPick;
        }
        if (secondPick != userChoice && !doors[userChoice]) {
            return secondPick;
        }

        return secondPick;
    }
}
