class Solution {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] brr=new int[nums.length];
        for(int i=0; i< nums.length; i++){
            int count=0;
            for(int j=0; j< nums.length; j++){
                if(i!=j && nums[i]>nums[j]){
                    count++;
                }
            }
            brr[i]=count;
        }
        return brr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int length=sc.nextInt();
        int[] arr=new int[length];

        for(int i=0; i<length; i++){
            arr[i]=sc.nextInt();
        }
        int[] result=smallerNumbersThanCurrent(arr);
        for(int i:result){
            System.out.print(1);
        }
    }
}
