package org.nhnacademy.races.unit.zergUnits;

import org.nhnacademy.Player;
import org.nhnacademy.races.unit.BroodWarUnitProperties;
import org.nhnacademy.races.unit.Flyable;
import org.nhnacademy.races.unit.Unit;

public class Queen extends Unit implements Flyable {
    public Queen() {
        super(BroodWarUnitProperties.Queen.getAttack(), BroodWarUnitProperties.Queen.getDefence());

    }
    @Override
    public boolean attack(int youUnitNumber, Player player2) {
        return true;
    }
}
