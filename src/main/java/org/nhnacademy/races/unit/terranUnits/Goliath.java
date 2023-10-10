package org.nhnacademy.races.unit.terranUnits;

import org.nhnacademy.races.unit.FlyAttacker;
import org.nhnacademy.races.unit.TerranUnitProperties;
import org.nhnacademy.races.unit.Unit;

public class Goliath extends Unit implements FlyAttacker {
    public Goliath() {
        super(TerranUnitProperties.Goliath.getAtk(), TerranUnitProperties.Goliath.getDef());
    }
}
