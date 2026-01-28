public class array2 {
    public static int maxAbsoluteDifference(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int[] row : matrix) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
        }

        return Math.abs(max - min);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, -3},
            {4, 5, 6},
            {-7, 8, 9}
        };

        int result = maxAbsoluteDifference(matrix);
        System.out.println(result); // Output: 16
    }
}
