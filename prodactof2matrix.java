public class prodactof2matrix {
    public static void main(String[] args) {
        int [][] matrix = new int[][]{
            {1, 2},
            {3, 4}
        };
        int [][] matrix2 =new int[][]{
            {5, 6},
            {7, 8}
        };
        for (int i =0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                int prodact =0;
                for (int k=0;k<matrix.length;k++){
                    prodact += matrix[i][k] * matrix2[k][j];
                }
                System.out.print(prodact + " ");
            }
            System.out.println();
        }
    }
    
}
