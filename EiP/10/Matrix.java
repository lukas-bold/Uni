public class Matrix {

    static int[][] matrix = {
        { 1,  2,  3},
        { 4,  5,  6},
        { 7,  8,  9},
        {10, 11, 12}
    };

    public static boolean gleich(int[] a1, int[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length ;i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean enthaeltZeile(int[][] matrix, int[] zeile) {
        for (int i = 0; i < matrix.length ; i++ ) {
            if (gleich(matrix[i], zeile)) {
                return true;
            }
        }
        return false;
    }

    public static boolean enthaeltSpalte(int[][] matrix, int[] spalte) {
        return enthaeltZeile(transponieren(matrix), spalte);
    }

    public static int[][] transponieren(int[][] matrix) {
        int [][] destMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < destMatrix[0].length ; i++ ) {
            for (int j = 0; j < destMatrix.length ; j++) {
                destMatrix[j][i] = matrix[i][j];
            }
        }
        return destMatrix;
    }

    public static void main(String[] args) {
        System.out.println("gleich({1,2,3}, {1,2,3}): "
                + gleich(new int[]{1, 2, 3}, new int[]{1, 2, 3})); // true

        System.out.println("enthaeltSpalte(matrix, {2, 5, 8, 11}): "
                + enthaeltSpalte(matrix, new int[]{2, 5, 8, 11}));
    }
}