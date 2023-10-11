package org.nhnacademy.races.unit.terranUnits;

import org.nhnacademy.Player;
import org.nhnacademy.races.unit.Flyable;
import org.nhnacademy.races.unit.TerranUnitProperties;
import org.nhnacademy.races.unit.Unit;

public class Wraith extends Unit implements Flyable {
    public Wraith() {
        super(TerranUnitProperties.Wraith.getAttack(), TerranUnitProperties.Wraith.getDefence());
    }
    @Override
    public boolean attack(int youUnitNumber, Player player2) {
        return true;
    }
}
