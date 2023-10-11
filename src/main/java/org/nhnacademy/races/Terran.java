package org.nhnacademy.races;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.nhnacademy.races.unit.Unit;

public class Terran extends Races{

    private static final int MAX_UNIT = 6;
    private static final String RANDOM_PACKAGE_NAME = "org.nhnacademy.races.unit.terranUnits";
    private static final String PATH =  "src/main/java/org/nhnacademy/races/unit/terranUnits";
    public Terran(){
        super(MAX_UNIT,RANDOM_PACKAGE_NAME,PATH);
    }
}
