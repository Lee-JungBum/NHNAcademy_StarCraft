package org.nhnacademy;

import java.util.Scanner;
import org.nhnacademy.races.Races;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String userRaces;
        String comRaces;
        do {
            logger.info("플레이어의 종족을 선택해주세요. ");
            userRaces = scanner.next().toUpperCase();
            if (userRaces.equals("RANDOM")) {
                userRaces=randomRaces();
                break;
            }
        } while (!selectRaces(userRaces));
        comRaces=randomRaces();
    }

    private static boolean selectRaces(String races) {
        try {
            Races.valueOf(races);
            return true;
        } catch (IllegalArgumentException e) {
            logger.error("정의되지 않은 종족을 선택하였습니다. 다시입력해주세요.");
            return false;
        }
    }

    private static String randomRaces() {
        return Races.randomSelect().getRaces();

    }
}
