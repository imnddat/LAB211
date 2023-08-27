package logic;

public class BaseConversion {

    /**
     * Convert input number to decimal base
     *
     * @param inputNumber input number
     * @param inBase      input base
     * @return number in decimal base
     */
    public int convertToDec(String inputNumber, int inBase) {
        int decNum = 0;
        int decBase = 1;
        for (int i = inputNumber.length(); i > 0; i--) {
            switch (inputNumber.charAt(i - 1)) {
                case 'A':
                    decNum += 10 * decBase;
                    break;
                case 'B':
                    decNum += 11 * decBase;
                    break;
                case 'C':
                    decNum += 12 * decBase;
                    break;
                case 'D':
                    decNum += 13 * decBase;
                    break;
                case 'E':
                    decNum += 14 * decBase;
                    break;
                    
                case 'F':
                    decNum += 15 * decBase;
                    break;
                default:
                    decNum += Integer.parseInt(inputNumber.charAt(i - 1) + "") * decBase;
            }
            decBase *= inBase;
        }
        return decNum;
    }

    /**
     * Convert decimal base to output base
     *
     * @param decNum  number in decimal base
     * @param outBase output number
     * @return String output number
     */
    public String convertDecToOutBase(int decNum, int outBase) {
        String outNum = "";
        if (outBase == 10) {
            outNum = String.valueOf(decNum);
        } else {
            while (decNum > 0) {
                int remain;
                remain = decNum % outBase;
                switch (remain) {
                    case 10:
                        outNum = 'A' + outNum;
                        break;
                    case 11:
                        outNum = 'B' + outNum;
                        break;
                    case 12:
                        outNum = 'c' + outNum;
                        break;
                    case 13:
                        outNum = 'D' + outNum;
                        break;
                    case 14:
                        outNum = 'E' + outNum;
                        break;
                    case 15:
                        outNum = 'F' + outNum;
                        break;
                    default:
                        outNum = String.valueOf(remain) + outNum;
                }
                decNum /= outBase;
            }
        }
        return outNum;
    }
}
