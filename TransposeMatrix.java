class Solution {
    public static int[][] transpose(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;
        int[][] result = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int row=sc.nextInt();
        int column=sc.nextInt();
        int[][] array=new int[row][column];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                array[i][j]=sc.nextInt();
            }
        }
        int[][] result=transpose(array);
        for (int i=0; i<result.length; i++) {
            for (int j=0; j<result[i].length; j++) {
                System.out.printf("%4d", result[i][j]);
            }
            System.out.println();
        }
    }
}
