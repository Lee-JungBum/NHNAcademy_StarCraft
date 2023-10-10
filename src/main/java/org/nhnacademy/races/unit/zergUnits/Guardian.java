package org.nhnacademy.races.unit.zergUnits;

import org.nhnacademy.races.unit.Flyable;
import org.nhnacademy.races.unit.Unit;
import org.nhnacademy.races.unit.ZergUnitProperties;

public class Guardian extends Unit implements Flyable {
    public Guardian() {
        super(ZergUnitProperties.Guardian.getAtk(), ZergUnitProperties.Guardian.getDef());
    }
}
