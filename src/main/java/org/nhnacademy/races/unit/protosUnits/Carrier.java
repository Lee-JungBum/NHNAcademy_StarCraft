package org.nhnacademy.races.unit.protosUnits;

import org.nhnacademy.Player;
import org.nhnacademy.races.unit.BroodWarUnitProperties;
import org.nhnacademy.races.unit.Flyable;
import org.nhnacademy.races.unit.Unit;

public class Carrier extends Unit implements Flyable {
    public Carrier() {
        super(BroodWarUnitProperties.Carrier.getAttack(), BroodWarUnitProperties.Carrier.getDefence());
    }
    @Override
    public boolean attack(int youUnitNumber, Player player2) {
        return true;
    }
}
