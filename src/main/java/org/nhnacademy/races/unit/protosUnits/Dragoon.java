package org.nhnacademy.races.unit.protosUnits;

import org.nhnacademy.races.unit.FlyAttacker;
import org.nhnacademy.races.unit.ProtosUnits;
import org.nhnacademy.races.unit.Unit;

public class Dragoon extends Unit implements FlyAttacker {
    public Dragoon() {
        super(ProtosUnits.Dragoon.getAtk(), ProtosUnits.Dragoon.getDef());
    }
}
