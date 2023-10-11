package org.nhnacademy.races.unit.protosUnits;

import org.nhnacademy.Player;
import org.nhnacademy.races.unit.Flyable;
import org.nhnacademy.races.unit.ProtosUnitProperties;
import org.nhnacademy.races.unit.Unit;

public class Corsair extends Unit implements Flyable {
    public Corsair() {
        super(ProtosUnitProperties.Corsair.getAttack(), ProtosUnitProperties.Corsair.getDefence());
    }
    @Override
    public boolean attack(int youUnitNumber, Player player2) {
        return true;
    }
}
