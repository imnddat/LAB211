package main;

import utils.Helper;
import logic.BaseConversion;

public class Main {

    public static void main(String[] args) {
        BaseConversion changeBase = new BaseConversion();
        Helper validator = new Helper();
        System.out.print("Enter input base. ");
        int inBase = validator.getBase();
        System.out.print("Enter output base. ");
        int outBase = validator.getBase();
        System.out.print("Enter input number. ");
        String inputNumber = validator.getInputNumber(inBase);
        int decNum = changeBase.convertToDec(inputNumber, inBase);
        String outputNumber = changeBase.convertDecToOutBase(decNum, outBase);
        System.out.print("Output number: ");
        System.out.println(outputNumber);
    }
}
