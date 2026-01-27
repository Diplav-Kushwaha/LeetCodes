public class Array56_ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] array1=new int[n];
        array1= Arrays.copyOfRange(nums, 0, n);
        int[] array2=new int[n];
        array2=Arrays.copyOfRange(nums, n, nums.length);
        int k=0;
        for(int i=1; i<nums.length; i=i+2){
            nums[i-1]=array1[k];
            nums[i]=array2[k];
            k++;
        }
        return nums;
    }
}
