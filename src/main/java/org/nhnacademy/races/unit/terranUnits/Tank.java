package org.nhnacademy.races.unit.terranUnits;

import org.nhnacademy.races.unit.TerranUnits;
import org.nhnacademy.races.unit.Unit;

public class Tank extends Unit {
    public Tank() {
        super(TerranUnits.Tank.getAtk(), TerranUnits.Tank.getDef());
    }
}
