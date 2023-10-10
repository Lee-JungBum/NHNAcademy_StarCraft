package org.nhnacademy.races.unit;

public enum BroodWar {
    BattleCruzer(20,30),
    Carrier(25,40),
    Queen(15,25);
    private final int defence;
    private final int attack;

    BroodWar(int attack,int defence)
    {
        this.defence=defence;
        this.attack=attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getAttack() {
        return attack;
    }
}
