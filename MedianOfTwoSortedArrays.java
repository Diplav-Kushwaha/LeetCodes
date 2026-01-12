class Solution {
    public static double findMedianSortedArrays(int[] num1, int[] num2) {
        if(num1.length>num2.length) return findMedianSortedArrays(num2, num1);

        int m=num1.length;
        int n=num2.length;

        int low=0;
        int high=m;

        while(low<=high){

            int i=(low+high)/2;
            int j=(m+n+1)/2 -i;

            int maxLeftA;
            if(i==0) maxLeftA=Integer.MIN_VALUE;
            else maxLeftA=num1[i - 1];

            int minRightA;
            if(i==m) minRightA=Integer.MAX_VALUE;
            else minRightA=num1[i];

            int maxLeftB;
            if(j==0) maxLeftB=Integer.MIN_VALUE;
            else maxLeftB=num2[j-1];

            int minRightB;
            if(j==n) minRightB=Integer.MAX_VALUE;
            else minRightB=num2[j];

            if(maxLeftB<=minRightA && maxLeftA<=minRightB){
                if((m+n)%2==1) return Math.max(maxLeftA, maxLeftB);
                return (Math.max(maxLeftA, maxLeftB)+Math.min(minRightA, minRightB))/2.0;
            }
            else if (maxLeftA > minRightB) high = i - 1;
            else low = i + 1;
        }
        return 0.0;
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
        double result=findMedianSortedArrays(array1, array2);
        System.out.println(result);
    }    
}
