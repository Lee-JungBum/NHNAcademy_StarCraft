package org.nhnacademy.races.unit;

public enum TerranUnits {
    Marine(3,10),
    Tank(7,15),
    Goliath(5,15),
    Wraith(3,10),
    Valkyrie(4,12);
    private final int def;
    private final int atk;

    TerranUnits(int atk,int def)
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
