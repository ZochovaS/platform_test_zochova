import task1.Task1;
import task2.Task2;
import task3.entity.Coordinate;
import task3.repository.MatrixRepository;
import task3.repository.MatrixRepositoryImpl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

//---------------------------------------------------------------------------------------------
        Map<Coordinate, Integer> matrixMap = new HashMap<>();
        matrixMap.put(new Coordinate(0, 1), 3);
        matrixMap.put(new Coordinate(1, 0), 1);
        matrixMap.put(new Coordinate(2, 2), 4);
        matrixMap.put(new Coordinate(2, 3), -1);
        matrixMap.put(new Coordinate(3, 1), 1);
        MatrixRepository matrix = new MatrixRepositoryImpl(matrixMap);
//        Task 3:
        matrix.printMatrix();

        System.out.println(matrix.sum(2,2));

        matrix.set(0, 1, 5);
        matrix.printMatrix();

    }
}
