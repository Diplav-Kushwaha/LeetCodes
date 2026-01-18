class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0; i<length; i++){
            arr[i]=sc.nextInt();
        }
        
        int target=sc.nextInt();
        int[] result=twoSum(arr, target);
        for(int i:result){
            System.out.print(i);
        }
    }
}
