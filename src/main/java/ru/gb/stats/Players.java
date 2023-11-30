package ru.gb.stats;

public class Players {

    private String name;
    private boolean permanentSolution;

    public Players(String name, boolean permanentSolution) {
        this.name = name;
        this.permanentSolution = permanentSolution;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPermanentSolution() {
        return permanentSolution;
    }

    public void setPermanentSolution(boolean permanentSolution) {
        this.permanentSolution = permanentSolution;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", permanentSolution=" + permanentSolution +
                '}';
    }
}
