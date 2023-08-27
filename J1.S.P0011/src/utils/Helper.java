package utils;

public class Helper {

    /**
     * Format Binary.
     */
    private final String REGEX_BINARY = "[0-1]*";
    /**
     * Format Decimal.
     */
    private final String REGEX_DECIMAL = "[0-9]*";
    /**
     * Format Hexadecimal.
     */
    private final String REGEX_HEXADECIMAL = "[0-9A-Fa-f]*";

    /**
     * Get an input number in range 1-3 from the keyboard 1 is binary, 2 is
     * decimal, 3 is hexadecimal Convert 1 to 2, 2 to 20, 3 to 16
     *
     * @return base number 2 or 10 or 16
     */
    public int getBase() {
        int base;
        base = Validation.getInteger(
                1, 3,
                "Enter a number in range 1-3: ",
                "Number is out of range",
                "Not a valid number"
        );
        switch (base) {
            case 1:
                base = 2;
                break;
            case 2:
                base = 10;
                break;
            case 3:
                base = 16;
                break;
        }
        return base;
    }

    /**
     * Get an input number from the keyboard
     *
     * @param inBase input base
     * @return String input number
     */
    public String getInputNumber(int inBase) {
        String inputNumber = null;
        switch (inBase) {
            case 2:
                inputNumber = Validation.getString(
                        "Enter a binary number: ",
                        "Not a valid number",
                        REGEX_BINARY);
                break;
            case 10:
                inputNumber = Validation.getString(
                        "Enter a decimal number: ",
                        "Not a valid number",
                        REGEX_DECIMAL);
                break;
            case 16:
                inputNumber = Validation.getString(
                        "Enter a hexadecimal number: ",
                        "Not a valid number",
                        REGEX_HEXADECIMAL);
                break;
        }
        return inputNumber.toUpperCase();
    }
}
