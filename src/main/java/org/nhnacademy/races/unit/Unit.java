package org.nhnacademy.races.unit;

public abstract class Unit {

    private int atk;

    private int def;


    public void damage(int damage) {
        this.def = this.def - damage;
    }

    public int attack() {
        return atk;
    }

    public boolean isDie() {
        return def <= 0;
    }

    public Unit(int atk, int def) {
        this.atk = atk;
        this.def = def;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(현재 방어력: " + def + ")";
    }
}
