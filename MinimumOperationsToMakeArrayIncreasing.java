public class Array61_MinimumOperationsToMakeArrayIncreasing {

    public int minOperations(int[] nums) {
        int min=0;
        if(nums.length==1){
            return min;
        }
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>=nums[i+1]){
                int temp=nums[i+1];
                nums[i+1]=nums[i]+1;
                min=min+(nums[i+1]-temp);
            }
        }
        return min;
    }
}
