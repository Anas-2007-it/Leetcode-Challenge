class NumMatrix {

    int[][] prefix;

    public NumMatrix(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        prefix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (j == 0) {
                    prefix[i][j] = matrix[i][j];
                } else {
                    prefix[i][j] =
                        prefix[i][j - 1] + matrix[i][j];
                }
            }
        }
    }

    public int sumRegion(int row1, int col1,
                         int row2, int col2) {

        int sum = 0;

        for (int i = row1; i <= row2; i++) {

            if (col1 == 0) {
                sum += prefix[i][col2];
            } else {
                sum += prefix[i][col2]
                     - prefix[i][col1 - 1];
            }
        }

        return sum;
    }
}