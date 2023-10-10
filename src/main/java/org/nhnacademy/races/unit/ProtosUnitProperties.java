package org.nhnacademy.races.unit;

public enum ProtosUnitProperties {
    Zealot(5,20),
    Dragoon(3,15),
    HighTempler(10,2),
    Scout(5,10),
    Corsair(4,12);
    private final int attack;
    private final int defence;

    ProtosUnitProperties( int attack,int defence)
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
