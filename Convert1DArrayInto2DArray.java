class Solution {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] demo= new int[m][n];
        int k=0;
        if(original.length==m*n){
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    demo[i][j]=original[k];
                    k++;
                }
            }
            return demo;
        }
        return new int[][]{};
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int length=sc.nextInt();
        int[] array=new int[length];
        for(int i=0; i<length; i++){
            array[i]=sc.nextInt();
        }
        int row=sc.nextInt();
        int column=sc.nextInt();
        
        int[][] result=construct2DArray(array, row, column);
        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[i].length; j++){
                System.out.print(result[i]);
            }
            System.out.println();
        }
    }
}
