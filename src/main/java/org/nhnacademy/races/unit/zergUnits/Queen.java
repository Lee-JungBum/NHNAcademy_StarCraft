package org.nhnacademy.races.unit.zergUnits;

import org.nhnacademy.races.unit.BroodWar;
import org.nhnacademy.races.unit.Flyable;
import org.nhnacademy.races.unit.Unit;
import org.nhnacademy.races.unit.ZergUnits;

public class Queen extends Unit implements Flyable {
    public Queen() {
        super(BroodWar.Queen.getAtk(), BroodWar.Queen.getDef());
    }
}
