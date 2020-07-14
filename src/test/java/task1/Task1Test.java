package task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task1Test {
    private static final int[] inputArray1 = new int[]{0,1,3,0,8,12,0,4,0,7};;
    private static final int[] inputArray2 = new int[]{1,3,0,0,0,8,12,0,4,0,0};
    private static final int[] inputArray3 = new int[]{0,0,1,-3,0,0,0,8,12,0,4,0,0};
    private static final int[] expectedOutput1 = new int[]{1,3,8,12,4,7,0,0,0,0};
    private static final int[] expectedOutput2 = new int[]{1,3,8,12,4,0,0,0,0,0,0};
    private static final int[] expectedOutput3 = new int[]{1,-3,8,12,4,0,0,0,0,0,0,0,0};

    @ParameterizedTest
    @MethodSource("arrayProvider")
    @DisplayName("Zeroes moved to end of result array")
    public void moveZeroesToEndOfResultArray(int[] inputArray, int[] expectedOutput) {
        int[] actualOutput = Task1.moveZeroesToEndOfResultArray(inputArray);

        for (int i = 0; i < expectedOutput.length; i++) {
            Assertions.assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }

    @ParameterizedTest
    @MethodSource("arrayProvider")
    @DisplayName("Zeroes moved to end of input array")
    public void moveZeroesToEndOfArray(int[] inputArray, int[] expectedOutput) {
        int[] actualOutput = Task1.moveZeroesToEndOfArray(inputArray);

        for (int i = 0; i < expectedOutput.length; i++) {
            Assertions.assertEquals(expectedOutput[i], actualOutput[i]);
        }
    }

    private static Stream<Arguments> arrayProvider() {
        return Stream.of(
                Arguments.arguments(inputArray1, expectedOutput1),
                Arguments.arguments(inputArray2, expectedOutput2),
                Arguments.arguments(inputArray3, expectedOutput3)
        );
    }
}