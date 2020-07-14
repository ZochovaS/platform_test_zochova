import task1.Task1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] inputArray1 = new int[]{1,3,0,8,12,0,4,0,7};
        int[] inputArray2 = new int[]{1,3,0,8,12,0,4,0,7};

//        Task 1: First implementation - Algorithmic complexity: linear
        System.out.println(Arrays.toString(Task1.moveZeroesToEndOfResultArray(inputArray1)));

//        Task1: Second implementation- Algorithmic complexity:n2 complexity
        System.out.println(Arrays.toString(Task1.moveZeroesToEndOfArray(inputArray2)));
        
    }
}
