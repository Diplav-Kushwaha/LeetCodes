public class Array25_CountNegativeNumbersInSortedMatrix {
    public static int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]<0){
                    count=count+1;
                }
            }
        }
        return count;
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
        int result=countNegatives(array);
        System.out.println(result);
    }
}
