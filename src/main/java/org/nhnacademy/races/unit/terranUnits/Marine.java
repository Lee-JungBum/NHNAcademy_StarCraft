package org.nhnacademy.races.unit.terranUnits;

import org.nhnacademy.races.unit.TerranUnits;
import org.nhnacademy.races.unit.Unit;

public class Marine extends Unit {
    public Marine() {
        super(TerranUnits.Marine.getAtk(), TerranUnits.Marine.getDef());
    }
}
