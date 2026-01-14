class Solution {
    public static boolean checkXMatrix(int[][] grid) {
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(i==j){
                    if(grid[i][j]==0) return false;
                }
                if((i+j)== grid.length-1){
                    if(grid[i][j]==0) return false;
                }
                if(i!=j && (i+j)!= grid.length-1){
                    if(grid[i][j]!=0) return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[][] array=new int[length][length];
        for(int i=0; i<length; i++){
            for(int j=0; j<length; j++){
                array[i][j]=sc.nextInt();
            }
        }
        boolean result= checkXMatrix(array);
        System.out.println(result);
    }
}
