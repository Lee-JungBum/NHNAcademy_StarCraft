package org.nhnacademy.races.unit.terranUnits;

import org.nhnacademy.races.unit.TerranUnitProperties;
import org.nhnacademy.races.unit.Unit;

public class Tank extends Unit {
    public Tank() {
        super(TerranUnitProperties.Tank.getAttack(), TerranUnitProperties.Tank.getDefence());
    }
}
