package org.nhnacademy.races.unit.protosUnits;

import org.nhnacademy.Player;
import org.nhnacademy.races.unit.Flyable;
import org.nhnacademy.races.unit.ProtosUnitProperties;
import org.nhnacademy.races.unit.Unit;

public class Scout extends Unit implements Flyable {
    public Scout() {
        super(ProtosUnitProperties.Scout.getAttack(), ProtosUnitProperties.Scout.getDefence());
    }

    @Override
    public boolean attack(int youUnitNumber, Player player2) {
        player2.getRaces().getUnits(youUnitNumber).damage(ProtosUnitProperties.Scout.getAttack());
        return true;
    }
}
