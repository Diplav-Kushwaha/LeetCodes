class Solution {
    public static int[] plusOne(int[] arr){
        for (int i=arr.length-1; i>=0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        int[] brr= new int[arr.length + 1];
        brr[0] = 1;
        return brr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] array=new int[length];
        for(int i=0; i<length; i++){
            array[i]=sc.nextInt();
        }
        int[] result=plusOne(array);
        System.out.println(Arrays.toString(result));
    }
}
