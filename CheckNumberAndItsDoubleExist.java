class Solution {
    public static boolean checkIfExist(int[] arr) {
        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr.length; j++){
                if(i!=j){
                    if(arr[i]==2*arr[j]) return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] array=new int[length];
        for(int i=0; i<length; i++){
            array[i]=sc.nextInt();
        }
        boolean result=checkIfExist(array);
        System.out.println(result);
    }
}
