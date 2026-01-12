class Solution {
    public static int maximumWealth(int[][] arr) {
        if(arr.length==0) return 0;
        else {
            int[] brr=new int[arr.length];
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[i].length; j++){
                    brr[i]=brr[i]+arr[i][j];
                }
            }
            int max=brr[0];
            for(int i=1; i< arr.length; i++){
                if(brr[i]>max) max=brr[i];
            }
            return max;
        }       
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
        int result=maximumWealth(array);
        System.out.println(result);
    }
}
