package org.nhnacademy.races.unit.terranUnits;

import org.nhnacademy.races.unit.Flyable;
import org.nhnacademy.races.unit.TerranUnits;
import org.nhnacademy.races.unit.Unit;

public class Valkyrie extends Unit implements Flyable {
    public Valkyrie() {
        super(TerranUnits.Valkyrie.getAtk(), TerranUnits.Valkyrie.getDef());
    }
}
