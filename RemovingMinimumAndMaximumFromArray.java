class Solution {
    public static int minimumDeletions(int[] nums) {

        int size= nums.length;
        int min=nums[0];
        int indexOfMin = 0;
        int max=nums[0];
        int indexOfMax=0;

        for(int i=0; i< nums.length; i++){
            if(min>nums[i]){
                min=nums[i];
                indexOfMin=i;
            }
            if(max<nums[i]){
                max=nums[i];
                indexOfMax=i;
            }
        }
        int a=Math.max(indexOfMin+1,indexOfMax+1 );
        int b=Math.max(size-indexOfMin, size-indexOfMax);
        int c=indexOfMin+(size-indexOfMax)+1;
        int d=indexOfMax+(size-indexOfMin)+1;
        int e=Math.min(a, b);
        int f=Math.min(c, d);
        int result=Math.min(e, f);
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int length=sc.nextInt();
        int[] array=new int[length];
        for(int i=0; i<length; i++){
            array[i]=sc.nextInt();
        }
        int result=minimumDeletions(array);
        System.out.println(result);
    }
}
