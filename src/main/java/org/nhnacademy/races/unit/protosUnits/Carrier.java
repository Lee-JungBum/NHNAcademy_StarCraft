package org.nhnacademy.races.unit.protosUnits;

import org.nhnacademy.races.unit.BroodWar;
import org.nhnacademy.races.unit.Flyable;
import org.nhnacademy.races.unit.ProtosUnits;
import org.nhnacademy.races.unit.Unit;

public class Carrier extends Unit implements Flyable {
    public Carrier() {
        super(BroodWar.Carrier.getAtk(), BroodWar.Carrier.getDef());
    }
}
