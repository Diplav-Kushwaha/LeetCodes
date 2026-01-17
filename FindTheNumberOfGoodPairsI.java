class Solution {
    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count=0;
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i]%(nums2[j]*k)==0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int length1=sc.nextInt();
        int length2=sc.nextInt();
        
        int[] array1=new int[length1];
        for(int i=0; i<length1; i++){
            array1[i]=sc.nextInt();
        }

        int[] array2=new int[length2];
        for(int i=0; i<length2; i++){
            array2[i]=sc.nextInt();
        }
        
        int k=sc.nextInt();
        int result=numberOfPairs(array1, array2, k);
        System.out.println(result);
    }
}
