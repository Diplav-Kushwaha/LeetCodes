class Solution {
    public static int differenceOfSum(int[] nums) {
        int valueSum=0;
        int digitSum=0;
        for(int i=0; i< nums.length; i++){
            valueSum=valueSum+nums[i];
            while(nums[i]!=0){
                digitSum=digitSum+nums[i]%10;
                nums[i]=nums[i]/10;
            }
        }
        int difference=valueSum-digitSum;
        if(difference<0) return -1*difference;
        return difference;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int length=sc.nextInt();
        int[] array=new int[length];
        for(int i=0; i<length; i++){
            array[i]=sc.nextInt();
        }
        int result=differenceOfSum(array);
        System.out.println(result);
    }
}
