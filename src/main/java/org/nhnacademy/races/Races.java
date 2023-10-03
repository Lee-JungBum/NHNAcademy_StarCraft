package org.nhnacademy.races;

import java.util.Random;

public enum Races {
    ZERG("ZERG"),
    PROTOS("PROTOS"),
    TERRAN("TERRAN");
    String races;
    Races(String races)
    {
        this.races=races;
    }
    private static final Random random = new Random();

    public String getRaces() {
        return races;
    }

    public static Races randomSelect()  {
        Races[] races = values();
        return races[random.nextInt(races.length)];
    }

}
