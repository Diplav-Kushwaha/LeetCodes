public class Array58_FindTheMiddleIndexInArray {

    public int findMiddleIndex(int[] nums) {
        int length=nums.length;

        for(int i=0; i<length; i++){
            int sum1=0;
            int sum2=0;
            for(int j=i+1; j<length; j++){
                sum1=sum1+nums[j];
            }
            for(int j=0; j<i; j++){
                sum2=sum2+nums[j];
            }
            if(sum1==sum2){
                return i;
            }
        }
        return -1;
    }
}
