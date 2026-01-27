public class Array57_SplitTheArray {
    public boolean isPossibleToSplit(int[] nums) {
        Arrays.sort(nums);
        for(int i=2; i<nums.length; i++){
            if(nums[i-2]==nums[i-1]){
                if(nums[i-1]==nums[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
