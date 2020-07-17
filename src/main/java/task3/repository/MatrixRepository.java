package task3.repository;

public interface MatrixRepository {

    /**
     * Method set value on the specific coordinate.
     * @param row number of row where the value is placed within the matrix.
     * @param col number of column where the value is placed within the matrix.
     * @param value to be set on the given coordinates within the matrix.
     */
    void set(int row, int col, int value);

    /**
     * Method do sum of values within the sub-matrix defined.
     * @param row number of row where the value is placed within the matrix.
     * @param col number of column where the value is placed within the matrix.
     * @return sum of the values within the sub-matrix defined.
     */
    int sum(int row, int col);

    /**
     * Method prints matrix in its string format while its boundaries are set based on the highest coordinates on
     * which non-zero value is present.
     * This method is only for testing purposes so as the matrix could be printed.
     * For very large matrices it can cause OutOfMemoryError Exception.
     */
    void printMatrix();

    /**
     * Method used only for testing purposes.
     * @param row number of row where the value is placed within the matrix.
     * @param col number of column where the value is placed within the matrix.
     * @return value on the given coordinates.
     */
    int getCellValue(int row, int col);
}
