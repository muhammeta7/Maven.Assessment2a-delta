package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {

        int padding = amountOfPadding - stringToBePadded.length();
        for(int i = 0; i < padding; i++){
            stringToBePadded = " " + stringToBePadded;
        }
        return stringToBePadded;

    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        int padding = amountOfPadding - stringToBePadded.length();
        for(int i = 0; i < padding; i++){
            stringToBePadded = stringToBePadded + " ";
        }
        return stringToBePadded;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {

        String repeat = "";
        for(int i = 0; i < numberOfTimeToRepeat; i++){
            repeat += stringToBeRepeated;
        }
        return repeat;

    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {

        char[] charArray = string.toCharArray();
        for(Character c : charArray){
            if((!Character.isAlphabetic(c)) && (!c.toString().equals(" "))){
                return false;
            }
        }
        return true;

    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {

        char[] charArray = string.toCharArray();
        for(Character c : charArray) {
            if((!Character.isDigit(c)) && (!c.toString().equals(" "))){
                return false;
            }
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {

        char[] charArray = string.toCharArray();
        for(Character c : charArray) {
            if( Character.isDigit(c) || Character.isAlphabetic(c)){
                return false;
            }
        }
        return true;

    }
}
