package org.nhnacademy.races.unit.zergUnits;

import org.nhnacademy.races.unit.Flyable;
import org.nhnacademy.races.unit.Unit;
import org.nhnacademy.races.unit.ZergUnits;

public class Guardian extends Unit implements Flyable {
    public Guardian() {
        super(ZergUnits.Guardian.getAtk(), ZergUnits.Guardian.getDef());
    }
}
