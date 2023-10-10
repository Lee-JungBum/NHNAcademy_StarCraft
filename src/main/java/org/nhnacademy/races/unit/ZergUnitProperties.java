    package org.nhnacademy.races.unit;

    public enum ZergUnitProperties {
        Zergling(2,2),
        Hydralisk(3,7),
        Ultralisk(5,15),
        Mutalisk(2,8),
        Guardian(3,6);
        private final int attack;
        private final int defence;

        ZergUnitProperties( int attack,int defence)
        {
            this.defence=defence;
            this.attack=attack;
        }

        public int getDefence() {
            return defence;
        }

        public int getAttack() {
            return attack;
        }
    }
