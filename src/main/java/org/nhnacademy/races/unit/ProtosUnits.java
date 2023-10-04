package org.nhnacademy.races.unit;

public enum ProtosUnits {
    Zealot(5,20),
    Dragoon(3,15),
    HighTempler(10,2),
    Scout(5,10),
    Corsair(4,12);
    private final int atk;
    private final int def;

    ProtosUnits( int atk,int def)
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
