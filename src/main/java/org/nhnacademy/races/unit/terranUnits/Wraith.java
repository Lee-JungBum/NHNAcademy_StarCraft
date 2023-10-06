package org.nhnacademy.races.unit.terranUnits;

import org.nhnacademy.races.unit.FlyAttacker;
import org.nhnacademy.races.unit.Flyable;
import org.nhnacademy.races.unit.TerranUnits;
import org.nhnacademy.races.unit.Unit;

public class Wraith extends Unit implements Flyable {
    public Wraith() {
        super(TerranUnits.Wraith.getAtk(), TerranUnits.Wraith.getDef());
    }
}
