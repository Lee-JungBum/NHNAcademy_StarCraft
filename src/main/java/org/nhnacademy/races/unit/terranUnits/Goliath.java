package org.nhnacademy.races.unit.terranUnits;

import org.nhnacademy.races.unit.FlyAttacker;
import org.nhnacademy.races.unit.TerranUnits;
import org.nhnacademy.races.unit.Unit;

public class Goliath extends Unit implements FlyAttacker {
    public Goliath() {
        super(TerranUnits.Goliath.getAtk(), TerranUnits.Goliath.getDef());
    }
}
