package org.nhnacademy.races;

import java.util.List;
import java.util.Random;
import org.nhnacademy.races.unit.Unit;

public interface Races {

    Unit getUnits(int i);

    void removeUnit(int i);

    int getSize();
}
