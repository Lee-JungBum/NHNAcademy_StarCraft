package org.nhnacademy.races.unit.zergUnits;

import org.nhnacademy.races.unit.BroodWar;
import org.nhnacademy.races.unit.Flyable;
import org.nhnacademy.races.unit.Unit;

public class Queen extends Unit implements Flyable {
    public Queen() {
        super(BroodWar.Queen.getAtk(), BroodWar.Queen.getDef());
    }
}
