package org.nhnacademy.races.unit.zergUnits;

import org.nhnacademy.Player;
import org.nhnacademy.races.unit.Flyable;
import org.nhnacademy.races.unit.Unit;
import org.nhnacademy.races.unit.ZergUnitProperties;

public class Guardian extends Unit implements Flyable {
    public Guardian() {
        super(ZergUnitProperties.Guardian.getAttack(), ZergUnitProperties.Guardian.getDefence());

    }
    @Override
    public boolean attack(int youUnitNumber, Player player2) {
        return true;
    }
}
