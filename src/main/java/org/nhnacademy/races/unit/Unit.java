package org.nhnacademy.races.unit;

import org.slf4j.Logger;
import org.nhnacademy.Player;
import org.slf4j.LoggerFactory;

public abstract class Unit {

    private final int ATTACK;

    private int DEFENCE;
    private final String WEAPON;
    private Logger logger = LoggerFactory.getLogger(Unit.class);

    public void damage(int ATTACK) {
        this.DEFENCE = this.DEFENCE - ATTACK;
    }

    public boolean attack(int youUnitNumber, Player player2) {
        if (player2.getRaces().getUnits(youUnitNumber) instanceof Flyable&&isWEAPON()) {
            logger.info("{}은 {}공격이 불가능합니다.", this.getClass().getSimpleName(), player2.getRaces().getUnits(youUnitNumber));
            return false;
        }
        player2.getRaces().getUnits(youUnitNumber).damage(ATTACK);
        return true;
    }

    public boolean isWEAPON(){
        return WEAPON!=null;
    }
    public boolean isDie() {
        return DEFENCE <= 0;
    }
    public Unit(int ATTACK, int DEFENCE,String WEAPON) {
        this.ATTACK = ATTACK;
        this.DEFENCE = DEFENCE;
        this.WEAPON=WEAPON;
    }

    public Unit(int ATTACK, int DEFENCE) {
        this.ATTACK = ATTACK;
        this.DEFENCE = DEFENCE;
        this.WEAPON=null;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(현재 방어력: " + DEFENCE + ")";
    }
}
