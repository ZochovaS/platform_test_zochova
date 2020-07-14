package task1;

public final class Task1 {

    private Task1() {
        throw new AssertionError("You should not instantiate this class");
    }

    //    First implementation- Algorithmic complexity: linear
    /**
     * Method iterates through given array and move every value equal to zero to the end of array while the
     * sequence of non-zero element stays unchanged.
     * @param inputArray Array to be sorted.
     * @return new array of integers where all non-zero elements have the same sequence as in the original inputArray
     * given, while all zero elements are placed to the end of the array.
     */
    public static int[] moveZeroesToEndOfResultArray(int[] inputArray) {
        int[] resultArray = new int[inputArray.length];
        int countOfZeroes = 0;
        int resultArrayIndex = 0;

        for (int number: inputArray) {
            if (number == 0) {
                countOfZeroes++;
            } else {
                resultArray[resultArrayIndex] = number;
                resultArrayIndex++;
            }
        }
        for (int i = 0; i<countOfZeroes; i++) {
            resultArray[resultArrayIndex] = 0;
            resultArrayIndex++;
        }
        return resultArray;
    }

    // Second implementation- Algorithmic complexity:n2 complexity

    /**
     * Method iterates through input array and swap every zero element until all zeros are at the end of the array
     * @param inputArray Array to be sorted.
     * @return original input array in which all zero elements are at the end of array while sequence of non-zero
     * elements stays the same.
     */
    public static int[] moveZeroesToEndOfArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length - 1;) {
            if (inputArray[i] == 0){
                int countOfNonZeroElements = 0;
                for (int j = i;j < inputArray.length -1; j++) {
                    if (inputArray[j + 1]!= 0) {
                        swapZeroWithValue(j, j+1, inputArray);
                        countOfNonZeroElements++;
                    }
                }
                if (countOfNonZeroElements == 0) {
                    break;
                }
            }
            else {
                i++;
            }
        }
        return inputArray;
    }

    private static void swapZeroWithValue(int indexOfZero, int indexOfValueToBeSwapped, int[] inputArray) {
        inputArray[indexOfZero] = inputArray[indexOfValueToBeSwapped];
        inputArray[indexOfValueToBeSwapped] = 0;
    }
}
