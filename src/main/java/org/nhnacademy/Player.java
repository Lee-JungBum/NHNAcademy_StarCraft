package org.nhnacademy;

import org.nhnacademy.races.Protos;
import org.nhnacademy.races.Races;
import org.nhnacademy.races.Terran;
import org.nhnacademy.races.Zerg;

public class Player {
    private Races races;
    public Player(String racesFK)
    {
        if(racesFK.equals("PROTOS"))
        {
            races = new Protos();
        }else if(racesFK.equals("TERRAN"))
        {
            races = new Terran();
        }else if(racesFK.equals("ZERG"))
        {
            races = new Zerg();
        }
    }

    public Races getRaces() {
        return races;
    }
}
