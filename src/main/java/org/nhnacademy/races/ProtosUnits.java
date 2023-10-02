package org.nhnacademy.races;

public enum ProtosUnits {
    Zealot(5,20),
    Dragoon(3,15),
    HighTempler(10,2),
    Scout(5,10),
    Corsair(4,12);
    private final int def;
    private final int atk;

    ProtosUnits(int def, int atk)
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
