package subway.utils;

import java.util.Scanner;

public class InputUtils {

    public static char inputFunctionSelect(Scanner scanner, int bound, char quit){
        OutputUtils.selectMenu();
        try{
            String selectMenu = scanner.nextLine();
            if(!ValidateUtils.isValidMenuSelect(selectMenu, bound, quit))
                throw new IllegalArgumentException();
            OutputUtils.newline();
            return selectMenu.charAt(0);
        }catch(IllegalArgumentException e){
            OutputUtils.invalidMenuError();
            return inputFunctionSelect(scanner, bound, quit);
        }
    }

    public static String inputStationName(Scanner scanner){
        try{
            String stationName = scanner.nextLine();
            if(!ValidateUtils.isValidStationName(stationName))
                throw new IllegalArgumentException();
            OutputUtils.newline();
            return stationName;
        }catch(IllegalArgumentException e){
            OutputUtils.invalidStationNameError();
            return inputStationName(scanner);
        }
    }
}
