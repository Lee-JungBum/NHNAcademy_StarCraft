package org.nhnacademy.races;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.nhnacademy.races.unit.ProtosUnits;
import org.nhnacademy.races.unit.Unit;

public class Terran implements Races{
    private List<Unit> units;
    private final int MAX_UNIT=5;
    public Terran() {
        units = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < MAX_UNIT; i++) {
            String randomUnitClassName = unitClassName(random);

            try {
                // Reflection을 사용하여 클래스 동적으로 로드
                Class<?> unitClass = Class.forName(randomUnitClassName);
                // 로드한 클래스의 인스턴스 생성
                Unit unit = (Unit) unitClass.getDeclaredConstructor().newInstance();
                units.add(unit);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    private String unitClassName(Random random) {


        String randomPackageName = "org.nhnacademy.races.unit.terranUnits";
        String path = "src/main/java/org/nhnacademy/races/unit/terranUnits";
        File dir = new File(path);
        String[] filenames = dir.list();

        String randomClassName = filenames[random.nextInt(filenames.length)];
        return randomPackageName + "." + randomClassName.substring(0,randomClassName.length()-5);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int i=0;
        for(Unit unit:units) {
            stringBuilder.append(i++).append(". ").append(unit).append("\n");
        }
        return stringBuilder.toString();
    }
    @Override
    public Unit getUnits(int i) {
        return units.get(i);
    }
    @Override
    public void removeUnit(int i) {
        units.remove(i);
    }

    @Override
    public int getSize() {
        return units.size();
    }
}
