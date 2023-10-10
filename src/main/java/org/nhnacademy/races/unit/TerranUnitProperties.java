package org.nhnacademy.races.unit;

public enum TerranUnitProperties {
    Marine(3,10),
    Tank(7,15),
    Goliath(5,15),
    Wraith(3,10),
    Valkyrie(4,12);
    private final int attack;
    private final int defence;

    TerranUnitProperties( int attack,int defence)
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
