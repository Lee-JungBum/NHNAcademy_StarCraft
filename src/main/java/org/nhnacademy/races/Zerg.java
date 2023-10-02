package org.nhnacademy.races;

public enum Zerg {
    Zergling(2,2),
    Hydralisk(3,7),
    Ultralisk(5,15),
    Mutalisk(2,8),
    Guardian(3,6);
    private final int def;
    private final int atk;

    Zerg(int def, int atk)
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
