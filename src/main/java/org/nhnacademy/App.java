package org.nhnacademy;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import org.nhnacademy.races.Protos;
import org.nhnacademy.races.Races;
import org.nhnacademy.races.RacesEnum;
import org.nhnacademy.races.unit.FlyAttacker;
import org.nhnacademy.races.unit.Flyable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);
    private static final Scanner scanner = new Scanner(System.in);
    private static Player user;
    private static Player computer;

    public static void main(String[] args) {
        String userRaces;
        String comRaces;
        do {
            logger.info("플레이어의 종족을 선택해주세요. ");
            userRaces = scanner.nextLine().toUpperCase();
            if (userRaces.equals("RANDOM")) {
                userRaces = randomRaces();
                break;
            }
        } while (!selectRaces(userRaces));
        comRaces = randomRaces();
        user = new Player(userRaces);
        computer = new Player(comRaces);
        logger.info("user({})의 생성된 유닛들 \n{}", userRaces, user.getRaces());
        logger.info("computer({})의 생성된 유닛들 \n{}", comRaces, computer.getRaces());
        while (true) {
            int myUnitNumber = 11;
            int youUnitNumber = 11;
            while (true) {
                logger.info("공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요: ");
                String line = scanner.nextLine();
                StringTokenizer stringTokenizer = new StringTokenizer(line);
                if (stringTokenizer.countTokens() != 2) {
                    continue;
                }
                myUnitNumber = Integer.parseInt(stringTokenizer.nextToken());
                youUnitNumber = Integer.parseInt(stringTokenizer.nextToken());
                if (myUnitNumber < 0 || youUnitNumber <0 ||
                        myUnitNumber > user.getRaces().getSize() || youUnitNumber > computer.getRaces().getSize()){
                    continue;
                }
                if (computer.getRaces().getUnits(youUnitNumber) instanceof Flyable) {
                    if (!(user.getRaces().getUnits(myUnitNumber) instanceof Flyable || user.getRaces().getUnits(myUnitNumber) instanceof FlyAttacker)) {
                        logger.info("{}은 {}공격이 불가능합니다.", user.getRaces().getUnits(myUnitNumber).toString(), computer.getRaces().getUnits(youUnitNumber).toString());
                        continue;
                    }
                }
               if(
                        !user.getRaces().getUnits(myUnitNumber).isDie() && !computer.getRaces().getUnits(youUnitNumber).isDie()) {
                    break;
                }

            }

            if (turn(user, computer, myUnitNumber, youUnitNumber)) {
                logger.info("user의 승리 \n{}", user.getRaces());
                break;
            }
            logger.info("user : \n{}", user.getRaces());
            logger.info("computer : \n{}", computer.getRaces());
            while (true) {
                myUnitNumber = new Random().nextInt(user.getRaces().getSize());
                youUnitNumber = new Random().nextInt(computer.getRaces().getSize());
                if (myUnitNumber < 0 || youUnitNumber <0 ||
                        myUnitNumber > user.getRaces().getSize() || youUnitNumber > computer.getRaces().getSize()){
                    continue;
                }
                if (user.getRaces().getUnits(myUnitNumber) instanceof Flyable) {
                    if (!(computer.getRaces().getUnits(youUnitNumber) instanceof Flyable || computer.getRaces().getUnits(youUnitNumber) instanceof FlyAttacker)) {
                        logger.info("{}은 {}공격이 불가능합니다.", computer.getRaces().getUnits(youUnitNumber).toString(), user.getRaces().getUnits(myUnitNumber).toString());
                        continue;
                    }
                }
                if(
                        !user.getRaces().getUnits(myUnitNumber).isDie() && !computer.getRaces().getUnits(youUnitNumber).isDie()) {
                    break;
                }

            }
            if (turn(computer, user, youUnitNumber, myUnitNumber)) {
                logger.info("computer의 승리 \n{}", computer.getRaces());
                break;
            }
            logger.info("user : \n{}", user.getRaces());
            logger.info("computer : \n{}", computer.getRaces());

        }
    }


    private static boolean selectRaces(String races) {
        try {
            RacesEnum.valueOf(races);
            return true;
        } catch (IllegalArgumentException e) {
            logger.error("정의되지 않은 종족을 선택하였습니다. 다시입력해주세요.");
            return false;
        }
    }

    private static String randomRaces() {
        return RacesEnum.randomSelect().getRaces();

    }

    private static boolean turn(Player my, Player you, int myUnitNumber, int youUnitNumber) {
        you.getRaces().getUnits(youUnitNumber).damage(my.getRaces().getUnits(myUnitNumber).attack());
        for (int i = 0; i < you.getRaces().getSize(); i++) {
            if (you.getRaces().getUnits(i).isDie()) {
                you.getRaces().removeUnit(i);
            }
        }
        if (you.getRaces().getSize()==0) {
            return true;
        }
        return false;
    }
}
