class Solution {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int product1 = nums[n-1] * nums[n-2] * nums[n-3];
        int product2 = nums[0] * nums[1] * nums[n-1];

        return Math.max(product1, product2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int length=sc.nextInt();
        int[] arr=new int[length];

        for(int i=0; i<length; i++){
            arr[i]=sc.nextInt();
        }
        int result=maximumProduct(arr);
        System.out.println(result);
    }
}
