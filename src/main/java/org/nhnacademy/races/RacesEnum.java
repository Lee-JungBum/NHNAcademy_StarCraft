package org.nhnacademy.races;

import java.util.Random;

public enum RacesEnum {
    ZERG("ZERG"),
    PROTOS("PROTOS"),
    TERRAN("TERRAN");
    String races;
    RacesEnum(String races)
    {
        this.races=races;
    }
    private static final Random random = new Random();

    public String getRaces() {
        return races;
    }

    public static RacesEnum randomSelect()  {
        RacesEnum[] races = values();
        return races[random.nextInt(races.length)];
    }

}
