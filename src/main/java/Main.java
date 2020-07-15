import task1.Task1;
import task2.Task2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] inputArray1 = new int[]{1,3,0,8,12,0,4,0,7};
        int[] inputArray2 = new int[]{1,3,0,8,12,0,4,0,7};

//        Task 1: First implementation - Algorithmic complexity: linear
        System.out.println(Arrays.toString(Task1.moveZeroesToEndOfResultArray(inputArray1)));

//        Task1: Second implementation- Algorithmic complexity:n2 complexity
        System.out.println(Arrays.toString(Task1.moveZeroesToEndOfArray(inputArray2)));
//---------------------------------------------------------------------------------------------

        String inputToBeTested1 = "Deed";
        String inputToBeTested2 = "dabcbad";
        
//        Task 2: First implementation - Algorithmic complexity: linear
        System.out.println(Task2.isTheInputPalindromeForLoop(inputToBeTested1));
        System.out.println(Task2.isTheInputPalindromeForLoop(inputToBeTested2));

//        Task 2: Second implementation - Algorithmic complexity: linear - identify palindrome based on definition
//        from https://cs.wikipedia.org/wiki/Palindrom
        System.out.println(Task2.isTheInputPalindrome(inputToBeTested2));

    }
}
