package org.nhnacademy.races.unit.zergUnits;

import org.nhnacademy.races.unit.Flyable;
import org.nhnacademy.races.unit.Unit;
import org.nhnacademy.races.unit.ZergUnitProperties;

public class Mutalisk extends Unit implements Flyable {
    public Mutalisk() {
        super(ZergUnitProperties.Mutalisk.getAttack(), ZergUnitProperties.Hydralisk.getDefence());
    }
}
