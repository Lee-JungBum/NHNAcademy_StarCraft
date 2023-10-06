package org.nhnacademy.races;

import org.nhnacademy.races.unit.Unit;

public interface Races {

    Unit getUnits(int i);

    void removeUnit(int i);

    int getSize();
}
