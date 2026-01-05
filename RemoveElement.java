class Solution {
    public static int removeElement(int[] arr, int val){
        if(arr.length==0) return 0;
        
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int length=sc.nextInt();
        int[] array=new int[length];
        
        for(int i=0; i<array.length; i++){
            array[i]=sc.nextInt();
        }
        int value=sc.nextInt();
        int result=removeElement(array, value);
        System.out.println(result+", "+array);
    }
}
