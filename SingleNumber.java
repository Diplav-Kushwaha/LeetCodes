class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] array=new int[length];
        for(int i=0; i<length; i++){
            array[i]=sc.nextInt();
        }
        int result=singleNumber(array);
        System.out.println(result);
    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
