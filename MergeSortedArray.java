class Solution {
    public static int merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int length1=sc.nextInt();
        int length2=sc.nextInt();

        int[] array1=new int[length1 + length2];
        for(int i=0; i<length1; i++){
            array1[i]=sc.nextInt();
        }

        int[] array2=new int[length2];
        for(int i=0; i<length2; i++){
            array2[i]=sc.nextInt();
        }

        merge(array1, length1, array2, length2);
        for(int x: array1){
            System.out.print(x+" ");
        }
    }
}
