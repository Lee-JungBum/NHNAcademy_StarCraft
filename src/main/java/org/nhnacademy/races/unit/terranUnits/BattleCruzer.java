package org.nhnacademy.races.unit.terranUnits;

import org.nhnacademy.Player;
import org.nhnacademy.races.unit.*;

public class BattleCruzer extends Unit implements Flyable {
    public BattleCruzer() {
        super(BroodWarUnitProperties.BattleCruzer.getAttack(), BroodWarUnitProperties.BattleCruzer.getDefence());
    }
    @Override
    public boolean attack(int youUnitNumber, Player player2) {
        return true;
    }
}
