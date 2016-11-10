package com.simon;

import java.util.Map;

/**
 * Created by wen55527 on 11/9/16.
 */
public class SparseMatrix {


    public static int dotProduct(Map<Coordinate, Integer> matrixA, Map<Coordinate, Integer> matrixB) {
        int result = 0;
        for (Coordinate coordinate : matrixA.keySet()) {
            if (matrixB.containsKey(coordinate)) {
                result += matrixA.get(coordinate) * matrixB.get(coordinate);
            }
        }
        return result;
    }

    public static class Coordinate {
        public int row;
        public int column;

        public Coordinate(int row, int column) {
            this.row = row;
            this.column = column;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Coordinate that = (Coordinate) o;

            if (row != that.row) return false;
            return column == that.column;

        }

        @Override
        public int hashCode() {
            int result = row;
            result = 31 * result + column;
            return result;
        }
    }
}
