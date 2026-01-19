class Solution {
    public static int[] runningSum(int[] nums) {
        int size= nums.length;
        int sum=0;
        for(int i=0; i<size; i++){
            sum=sum+nums[i];
            nums[i]=sum;
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int length=sc.nextInt();
        int[] array=new int[length];
        for(int i=0; i<length; i++){
            array[i]=sc.nextInt();
        }
        int[] result=runningSum(array);
        for(int i:result){
            System.out.print(i);
        }
    }
}
