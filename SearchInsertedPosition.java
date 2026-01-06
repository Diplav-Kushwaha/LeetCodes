package LeetCodes;

import java.util.Scanner;

public class Array5_SearchInsertedPosition {
    public static int searchInsert(int[] arr, int targ) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = left + (right - left)/2;
            if (arr[mid] == targ){
                return mid;
            }
            else if (arr[mid] < targ){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return left;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int length=sc.nextInt();
        int[] array=new int[length];

        for(int i=0; i<length; i++){
            array[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int result=searchInsert(array, target);
        System.out.println(result);
    }
}
