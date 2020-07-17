package task3.repository;

import task3.entity.Coordinate;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public class MatrixRepositoryImpl implements MatrixRepository {

    private final Map<Coordinate, Integer> matrix;

    public MatrixRepositoryImpl(Map<Coordinate, Integer> matrix) {
        this.matrix = matrix;
    }

    @Override
    public void set(int row, int col, int value) {
        if (value == 0) {
            matrix.remove(new Coordinate(row, col));
        } else {
            matrix.put(new Coordinate(row, col), value);
        }
    }

    @Override
    public int sum(int row, int col) {
        int sum = 0;
        for (Coordinate coordinate: matrix.keySet()) {
            if (coordinate.getRow() <= row && coordinate.getColumn() <= col) {
                sum += matrix.get(coordinate);
            }
        }
        return sum;
    }

    @Override
    public int getCellValue(int row, int col) {
        Integer value = matrix.get(new Coordinate(row, col));
        return Objects.requireNonNullElse(value, 0);
    }

    @Override
    public void printMatrix() {
        int numberOfRows = 0;
        int numberOfCols = 0;
        for (Coordinate coordinate: matrix.keySet()) {
            if (coordinate.getRow() > numberOfRows) {
                numberOfRows = coordinate.getRow();
            }
            if (coordinate.getColumn() > numberOfCols) {
                numberOfCols = coordinate.getColumn();
            }
        }
        int [][] matrixToBePrinted = new int[numberOfRows + 1][numberOfCols + 1];
        for (Coordinate coordinate: matrix.keySet()) {
            matrixToBePrinted[coordinate.getRow()][coordinate.getColumn()] = matrix.get(coordinate);
        }
        for (int[] row : matrixToBePrinted){
            System.out.println(Arrays.toString(row));
        }
    }
}
