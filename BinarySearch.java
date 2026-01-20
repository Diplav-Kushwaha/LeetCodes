class Solution {
    public static int search(int[] nums, int target) {
        int start=0; 
        int end= nums.length-1;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            } else if (target>nums[mid]) {
                start=mid+1;
            }else return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] array=new int[length];
        
        for(int i=0; i<length; i++){
            array[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int result=search(array, target);
        System.out.println(result);
    }
}
