package org.nhnacademy.races.unit;

import org.slf4j.Logger;
import org.nhnacademy.Player;
import org.slf4j.LoggerFactory;

public abstract class Unit {

    private int atk;

    private int def;
    private String weapon;
    private Logger logger = LoggerFactory.getLogger(Unit.class);

    public void damage(int damage) {
        this.def = this.def - damage;
    }

    public boolean attack(int youUnitNumber, Player player2) {
        if (player2.getRaces().getUnits(youUnitNumber) instanceof Flyable) {
            if (weapon==null) {
                logger.info("{}은 {}공격이 불가능합니다.", this.getClass().getSimpleName(), player2.getRaces().getUnits(youUnitNumber).toString());
                return false;
            }
        }
        player2.getRaces().getUnits(youUnitNumber).damage(atk);
        return true;
    }
    public boolean isDie() {
        return def <= 0;
    }
    public Unit(int atk, int def,String weapon) {
        this.atk = atk;
        this.def = def;
        this.weapon=weapon;
    }

    public Unit(int atk, int def) {
        this.atk = atk;
        this.def = def;
        this.weapon=null;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(현재 방어력: " + def + ")";
    }
}
