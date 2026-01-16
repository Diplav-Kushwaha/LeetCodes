class Solution {
    public static int kthSmallest(int[][] matrix, int k) {
        int[] test=new int[matrix.length*matrix[0].length];
        int l=0;
        
        for (int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                test[l]=matrix[i][j];
                l++;
            }
        }
        Arrays.sort(test);
        return test[k-1];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int length=sc.nextInt();
        int[][] array=new int[length][length];

        for (int i=0; i<length; i++){
            for(int j=0; j<length; j++){
                array[i][j]=sc.nextInt();
            }
        }
        int Kth=sc.nextInt();
        int result=kthSmallest(array, Kth);
        System.out.println(result);
    }
}
