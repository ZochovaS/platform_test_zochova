package task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import task3.entity.Coordinate;
import task3.repository.MatrixRepository;
import task3.repository.MatrixRepositoryImpl;

import java.util.HashMap;
import java.util.Map;

public class MatrixRepositoryTest {

    private MatrixRepository matrixRepository;

    @BeforeEach
    public void init() {
        matrixRepository = new MatrixRepositoryImpl(prepareData(new HashMap<>()));
    }

    @Test
    @DisplayName("Value on the given coordinates is correctly changed")
    public void set_valueOfAlreadyCreatedCellIsCorrectlyChanged() {
        int expected = 5;
        Assertions.assertNotEquals(matrixRepository.getCellValue(0, 1), 0, "Test must be run on coordinates" +
                "already present in the matrixMap.");
        Assertions.assertNotEquals(matrixRepository.getCellValue(0, 1), expected, "Test must be run on different value" +
                "than it will be set by Test.");

        matrixRepository.set(0, 1, 5);
        int actual = matrixRepository.getCellValue(0, 1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Value on the given coordinates is correctly changed to zero")
    public void set_valueOfAlreadyCreatedCellIsCorrectlyChangedToZero() {
        Assertions.assertNotEquals(matrixRepository.getCellValue(0, 1),0, "Test must be run on coordinates" +
                "already present in the matrixMap.");
        int expected = 0;

        matrixRepository.set(0, 1, 0);
        int actual = matrixRepository.getCellValue(0, 1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("New cell on the given coordinates is correctly created")
    public void set_valueIsSetOnNewCoordinates() {
        Assertions.assertEquals(matrixRepository.getCellValue(0, 0), 0,"Test must be run on coordinates" +
                "currently not present in the matrixMap.");
        int expected = 4;

        matrixRepository.set(0, 0, 4);
        int actual = matrixRepository.getCellValue(0, 0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("New cell on coordinates out of boundaries of current matrixMap is correctly created")
    public void set_valueIsSetOnNewCoordinatesOutOfCurrentMatrixMapBoundaries() {
        Assertions.assertEquals(matrixRepository.getCellValue(4, 4), 0,"Test must be run on coordinates" +
                "currently not present in the matrixMap.");
        int expected = 10;

        matrixRepository.set(4, 4, 10);
        int actual = matrixRepository.getCellValue(4, 4);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Sum of values within tested subMatrix is correctly returned")
    public void sum_sumOfValuesWithinTestedSubMatrixIsCorrectlyReturned() {
        int expected = 8;

        int actual = matrixRepository.sum(2, 2);

        Assertions.assertEquals(expected, actual);
    }

    private Map<Coordinate, Integer> prepareData(Map<Coordinate, Integer> matrixMap) {
        matrixMap.put(new Coordinate(0, 1), 3);
        matrixMap.put(new Coordinate(1, 0), 1);
        matrixMap.put(new Coordinate(2, 2), 4);
        matrixMap.put(new Coordinate(2, 3), -1);
        matrixMap.put(new Coordinate(3, 1), 1);
        return matrixMap;
    }

}
