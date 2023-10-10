package org.nhnacademy.races.unit.zergUnits;

import org.nhnacademy.races.unit.Unit;
import org.nhnacademy.races.unit.ZergUnitProperties;

public class Ultralisk extends Unit {
    public Ultralisk() {
        super(ZergUnitProperties.Ultralisk.getAtk(), ZergUnitProperties.Ultralisk.getDef());
    }
}
