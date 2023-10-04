package org.nhnacademy.races.unit.zergUnits;

import org.nhnacademy.races.unit.Unit;
import org.nhnacademy.races.unit.ZergUnits;

public class Zergling extends Unit {
    public Zergling() {
        super(ZergUnits.Zergling.getAtk(),ZergUnits.Zergling.getDef());
    }
}
