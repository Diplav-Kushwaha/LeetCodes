public class Array38_AverageValueOfEvenNumbersThatAreDivisibleByThree {
    public static int averageValue(int[] nums) {
        int average=0;
        int count=0;
        for(int i=0; i< nums.length; i++){
            if(nums[i]%3==0 && nums[i]%2==0){
                average=average+nums[i];
                count++;
            }
        }
        if(count==0) return 0;
        return average/count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int length=sc.nextInt();
        int[] arr=new int[length];

        for(int i=0; i<length; i++){
            arr[i]=sc.nextInt();
        }
        int result=averageValue(arr);
        System.out.println(result);
    }
}
