
public class countNo {
    public static void CountNumber(int matrix[][]) {
        int count = 0;
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j <matrix[0].length; j++) {
                if (matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("Number 7's is " + count);
    }

    public static void main(String[] args) {
        int matrix[][] =   {{1,2,7},{4,7,8}};
        CountNumber(matrix);
    }
}
