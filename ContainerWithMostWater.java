public class Array23_ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] array=new int[length];
        for(int i=0; i<length; i++){
            array[i] =sc.nextInt();
        }
        int result=maxArea(array);
        System.out.println(result );
    }
}
