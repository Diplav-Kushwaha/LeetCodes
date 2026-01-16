class Solution {
    public static int matrixSum(int[][] nums) {

        int row = nums.length;
        int col = nums[0].length;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            Arrays.sort(nums[i]);
        }
        for (int j = 0; j < col; j++) {
            int max = 0;
            for (int i = 0; i < row; i++) {
                max = Math.max(max, nums[i][j]);
            }
            sum += max;
        }
        return sum;
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
        int result=matrixSum(array);
        System.out.println(result);
    }
}
