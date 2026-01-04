package LeetCodes;


import java.util.Scanner;

public class Array3_RemoveDuplicateFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int length =sc.nextInt();
        int[] array=new int[length];
        for(int i=0; i<array.length; i++){
            array[i]=sc.nextInt();
        }
        int result=removeDuplicates(array);
        System.out.print(result+", "+array);
    }
}
