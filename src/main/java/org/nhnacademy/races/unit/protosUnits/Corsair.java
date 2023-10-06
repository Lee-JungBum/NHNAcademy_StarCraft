package org.nhnacademy.races.unit.protosUnits;

import org.nhnacademy.races.unit.Flyable;
import org.nhnacademy.races.unit.ProtosUnits;
import org.nhnacademy.races.unit.Unit;

public class Corsair extends Unit implements Flyable {
    public Corsair() {
        super(ProtosUnits.Corsair.getAtk(), ProtosUnits.Corsair.getDef());
    }
}
