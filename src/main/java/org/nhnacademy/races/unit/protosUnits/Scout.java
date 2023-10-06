package org.nhnacademy.races.unit.protosUnits;

import org.nhnacademy.races.unit.Flyable;
import org.nhnacademy.races.unit.ProtosUnits;
import org.nhnacademy.races.unit.Unit;

public class Scout extends Unit implements Flyable {
    public Scout() {
        super(ProtosUnits.Scout.getAtk(), ProtosUnits.Scout.getDef());
    }
}
