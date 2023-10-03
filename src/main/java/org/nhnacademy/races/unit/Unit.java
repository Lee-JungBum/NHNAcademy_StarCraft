package org.nhnacademy.races.unit;

public abstract class Unit {
    private Unit() {
    }

    private int atk;

    private int def;


    public void damage(int damage) {
        this.def = this.def - damage;
    }

    public int life() {
        return def;
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
}
