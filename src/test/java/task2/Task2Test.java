package task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task2Test {

    @ParameterizedTest
    @ValueSource(strings = {"taky nežere ženy kat.", "udus v sudu.", "čím uhoní nohu míč?", "kobyla má malý bok."})
    @DisplayName("Czech palindrome returns true")
    public void isTheInputPalindrome_czechPalindromeReturnsTrue(String inputToBeTested) {
        assertTrue(Task2.isTheInputPalindrome(inputToBeTested),
                String.format("Input: %s was classified as not palindrome", inputToBeTested));
    }

    @ParameterizedTest
    @ValueSource(strings = {"cokoliv", "testovaci data", "no palindrome"})
    @DisplayName("Not czech palindrome returns false")
    public void isTheInputPalindrome_notCzechPalindromeReturnsFalse(String inputToBeTested) {
        assertFalse(Task2.isTheInputPalindrome(inputToBeTested),
                String.format("Input: %s was classified as not palindrome", inputToBeTested));
    }

    @ParameterizedTest
    @ValueSource(strings = {"kayak", "madam", "level"})
    @DisplayName("English palindrome returns true")
    public void isTheInputPalindromeForLoop_englishPalindromeReturnsTrue(String inputToBeTested) {
        assertTrue(Task2.isTheInputPalindromeForLoop(inputToBeTested),
                String.format("Input: %s was classified as not palindrome", inputToBeTested));
    }

    @ParameterizedTest
    @ValueSource(strings = {"cokoliv", "testovaci data", "no palindrome"})
    @DisplayName("Not english palindrome returns false")
    public void isTheInputPalindromeForLoop_notEnglishPalindromeReturnsFalse(String inputToBeTested) {
        assertFalse(Task2.isTheInputPalindromeForLoop(inputToBeTested),
                String.format("Input: %s was classified as not palindrome", inputToBeTested));
    }

}