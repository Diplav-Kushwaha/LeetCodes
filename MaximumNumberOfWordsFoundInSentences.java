class Solution {
    public static int mostWordsFound(String[] sentences) {

        int maxWords = 0;
        for (String sentence : sentences) {
            int words = 1;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    words++;
                }
            }
            maxWords = Math.max(maxWords, words);
        }
        return maxWords;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int length=sc.nextInt();
        sc.nextLine();
        String[] array=new String[length];
        for(int i=0; i<length; i++){
            array[i]=sc.nextLine();
        }
        int result=mostWordsFound(array);
        System.out.println(result);
    }
}
