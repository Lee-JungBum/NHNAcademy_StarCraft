package org.nhnacademy.races.unit.zergUnits;

import org.nhnacademy.races.unit.Flyable;
import org.nhnacademy.races.unit.Unit;
import org.nhnacademy.races.unit.ZergUnits;

public class Mutalisk extends Unit implements Flyable {
    public Mutalisk() {
        super(ZergUnits.Mutalisk.getAtk(), ZergUnits.Hydralisk.getDef());
    }
}
