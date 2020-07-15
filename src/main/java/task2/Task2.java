package task2;

import java.text.Normalizer;

public final class Task2 {

    private Task2() {
        throw new AssertionError("You should not instantiate this class");
    }

    //    First implementation- Algorithmic complexity: linear

    /**
     * Method transforms the input String into array of characters which are then compared one from forward to one
     * from backward.
     * @param inputToBeTested String to be tested for palindrome.
     * @return true if all comparisons resulted as equal.
     */
    public static boolean isTheInputPalindromeForLoop(String inputToBeTested) {
        char [] inputAsCharArray = inputToBeTested.toCharArray();
        for (int i=0, j=(inputAsCharArray.length-1); i<j; i++, j--) {
            if (inputAsCharArray[i] != inputAsCharArray[j]) {
                return false;
            }
        }
        return true;
    }

    //    Second implementation- Algorithmic complexity: linear
    /**
     * Method first transforms the input String into correct format and then it compares the transformed String in
     * forward and backward direction.
     * @param inputToBeTested String to be tested for palindrome.
     * @return true if transformed String in forward and backward direction equal to each other.
     */
    public static boolean isTheInputPalindrome(String inputToBeTested) {
        String inputForwards = transformInputIntoCorrectFormat(inputToBeTested);
        String inputBackwards = reverseString(inputForwards);
        return inputForwards.equals(inputBackwards);
    }

    private static String reverseString(String inputForwards) {
        return new StringBuilder(inputForwards).reverse().toString();
    }

    /**
     * Method takes the input String and removes all characters other then letters and replace all
     * characters which have diacritics with corresponding characters without diacritics (e.g. č -> c).
     * @param inputToBeTested String to be tested for palindrome.
     * @return new String which corresponds to the input String transformed.
     */
    private static String transformInputIntoCorrectFormat(String inputToBeTested) {
        String inputWithoutSpacesAndSigns = inputToBeTested.replaceAll("[^\\p{L}]", "");
        String result = Normalizer.normalize(inputWithoutSpacesAndSigns,
                Normalizer.Form.NFD);
        return result.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    }
}
