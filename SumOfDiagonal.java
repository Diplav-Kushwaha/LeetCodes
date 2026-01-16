class Solution {
    public static int diagonalSum(int[][] mat) {
        int length= mat.length;;
        int sum=0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if(i==j || i+j==length-1){
                    sum=sum+mat[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int[][] array = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int result=diagonalSum(array);
        System.out.println(result);
    }
}
