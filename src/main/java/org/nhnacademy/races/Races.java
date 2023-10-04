package org.nhnacademy.races;

import java.util.List;
import org.nhnacademy.races.unit.Unit;

public interface Races {
    int getMaxUnit();

    Unit getUnits(int i);

    void removeUnit(int i);

    int getSize();
}
