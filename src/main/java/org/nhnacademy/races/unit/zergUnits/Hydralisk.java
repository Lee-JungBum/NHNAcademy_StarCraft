package org.nhnacademy.races.unit.zergUnits;

import org.nhnacademy.races.unit.*;

public class Hydralisk extends Unit implements FlyAttacker {
    public Hydralisk() {
        super(ZergUnitProperties.Hydralisk.getAtk(), ZergUnitProperties.Hydralisk.getDef());
    }
}
