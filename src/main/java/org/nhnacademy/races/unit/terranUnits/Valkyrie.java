package org.nhnacademy.races.unit.terranUnits;

import org.nhnacademy.Player;
import org.nhnacademy.races.unit.Flyable;
import org.nhnacademy.races.unit.TerranUnitProperties;
import org.nhnacademy.races.unit.Unit;

public class Valkyrie extends Unit implements Flyable {
    public Valkyrie() {
        super(TerranUnitProperties.Valkyrie.getAttack(), TerranUnitProperties.Valkyrie.getDefence());
    }
    @Override
    public boolean attack(int youUnitNumber, Player player2) {
        return true;
    }
}
