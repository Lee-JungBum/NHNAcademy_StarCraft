package org.nhnacademy.races.unit;

public enum BroodWar {
    BattleCruzer(20,30),
    Carrier(25,40),
    Queen(15,25);
    private final int def;
    private final int atk;

    BroodWar(int atk,int def)
    {
        this.def=def;
        this.atk=atk;
    }

    public int getDef() {
        return def;
    }

    public int getAtk() {
        return atk;
    }
}
