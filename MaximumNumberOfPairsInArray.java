public class Array36_MaximumNumberOfPairsInArray {
    public static int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int pairs = 0;
        int leftover = 0;

        for (int freq : map.values()) {
            pairs += freq / 2;
            leftover += freq % 2;
        }

        return new int[]{pairs, leftover};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int length=sc.nextInt();
        int[] array=new int[length];

        for(int i=0; i<length; i++){
            array[i]=sc.nextInt();
        }
        int[] result=numberOfPairs(array);
        for(int i=0; i< result.length; i++){
            System.out.print(result[i]);
        }
    }
}
