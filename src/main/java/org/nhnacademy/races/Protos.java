package org.nhnacademy.races;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.nhnacademy.races.unit.Unit;

public class Protos extends Races {
    private static final int MAX_UNIT = 4;
    private static final String RANDOM_PACKAGE_NAME = "org.nhnacademy.races.unit.protosUnits";
    private static final String PATH = "src/main/java/org/nhnacademy/races/unit/protosUnits";
    public Protos()
    {
        super(MAX_UNIT,RANDOM_PACKAGE_NAME,PATH);
    }
}
