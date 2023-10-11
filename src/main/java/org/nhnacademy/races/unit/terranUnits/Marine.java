package org.nhnacademy.races.unit.terranUnits;

import org.nhnacademy.races.unit.TerranUnitProperties;
import org.nhnacademy.races.unit.Unit;

public class Marine extends Unit {
    public Marine() {
        super(TerranUnitProperties.Marine.getAttack(), TerranUnitProperties.Marine.getDefence());
    }
}
