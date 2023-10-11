package org.nhnacademy.races.unit.zergUnits;

import org.nhnacademy.races.unit.Unit;
import org.nhnacademy.races.unit.ZergUnitProperties;

public class Zergling extends Unit {
    public Zergling() {
        super(ZergUnitProperties.Zergling.getAttack(), ZergUnitProperties.Zergling.getDefence());
    }
}
