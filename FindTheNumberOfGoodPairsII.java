public class Array35_FindTheNumberOfGoodPairsII {
    public static long numberOfPairs(int[] nums1, int[] nums2, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums2) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        long count = 0;

        for (int num : nums1) {
            if (num % k != 0) continue;

            int target = num / k;

            for (int d = 1; d * d <= target; d++) {
                if (target % d == 0) {
                    if (freq.containsKey(d)) {
                        count += freq.get(d);
                    }
                    int other = target / d;
                    if (other != d && freq.containsKey(other)) {
                        count += freq.get(other);
                    }
                }
            }
        }
        return count;
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

        int k=sc.nextInt();
        long result=numberOfPairs(array1, array2, k);
        System.out.println(result);
    }
}
