package org.nhnacademy.races.unit.protosUnits;

import org.nhnacademy.races.unit.ProtosUnitProperties;
import org.nhnacademy.races.unit.Unit;

public class Zealot extends Unit {
    public Zealot() {
        super(ProtosUnitProperties.Zealot.getAttack(), ProtosUnitProperties.Zealot.getDefence());
    }
}
