package org.nhnacademy.races.unit.terranUnits;

import org.nhnacademy.races.unit.TerranUnitProperties;
import org.nhnacademy.races.unit.Unit;

public class Goliath extends Unit {
    public Goliath() {
        super(TerranUnitProperties.Goliath.getAttack(), TerranUnitProperties.Goliath.getDefence(),"misile");
    }
}
