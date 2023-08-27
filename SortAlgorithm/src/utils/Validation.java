package utils;

import java.util.Scanner;

public class Validation {

    /**
     * input a number integer
     *
     * @param min                       minimum limit value
     * @param max                       maximum limit value
     * @param messageInfo               display when user input
     * @param messageErrorOutOfRange    display when user input out of range
     * @param messageErrorInvalidNumber display when user input an invalid number
     * @return the integer value
     */
    public static int getInteger(
            int min,
            int max,
            String messageInfo,
            String messageErrorOutOfRange,
            String messageErrorInvalidNumber
    ) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.println(messageInfo);
                number = Integer.parseInt(scanner.nextLine());
                if (number >= min && number <= max) {
                    return number;
                }
                System.out.println(messageErrorOutOfRange);
            } catch (NumberFormatException e) {
                System.out.println(messageErrorInvalidNumber);
            }
        }
    }
}
