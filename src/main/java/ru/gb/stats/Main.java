package ru.gb.stats;

public class Main {
    public static void main(String[] args) {
        Players player1 = new Players("No change", false);
        long victoriesOld = Game.checkOldChoice(1000);
        Players player2 = new Players("Change", true);
        long victoriesNew = Game.checkNewChoice(1000);
        System.out.printf("%s выиграл %d раз", player1, victoriesOld);
        System.out.println();
        System.out.printf("%s выиграл %d раз", player2, victoriesNew);

    }
}
