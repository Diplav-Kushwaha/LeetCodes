public class Array24_FindNUniqueIntegersSumUpToZero {
    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        int k = 1;

        for (int i = 0; i < n / 2; i++) {
            arr[i] = k;
            arr[n - 1 - i] = -k;
            k++;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] result=new int[length];
        System.out.println(Arrays.toString(result));
    }
}
