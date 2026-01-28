public class Array59_SeparateDigitsInArray {

    public int[] separateDigits(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            int temp=nums[i];
            while(temp>0){
                temp=temp/10;
                count++;
            }
        }
        int[] result=new int[count];
        count--;
        for(int i=nums.length-1; i>=0; i--){
            while(nums[i]>0){
                result[count]=nums[i]%10;
                nums[i]=nums[i]/10;
                count--;
            }
        }
        return result;
    }
}
