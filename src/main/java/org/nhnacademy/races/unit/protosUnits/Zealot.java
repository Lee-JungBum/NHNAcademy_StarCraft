package org.nhnacademy.races.unit.protosUnits;

import org.nhnacademy.races.unit.Flyable;
import org.nhnacademy.races.unit.ProtosUnits;
import org.nhnacademy.races.unit.Unit;

public class Zealot extends Unit implements Flyable {
    public Zealot() {
        super(ProtosUnits.Zealot.getAtk(), ProtosUnits.Zealot.getDef());
    }
}
