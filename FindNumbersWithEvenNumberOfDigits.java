class Solution {
    public static int findNumbers(int[] array) {
        if(array.length==0) return 0;
        else{
            int numberCount=0;
            for(int i=0; i< array.length; i++){
                int num=array[i];
                int digitCount=0;
                while(num!=0){
                    num=num/10;
                    digitCount++;
                }
                if(digitCount%2==0){
                    numberCount++;
                }
            }
            return numberCount;
        }        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] array=new int[length];

        for(int i=0; i<length; i++){
            array[i]=sc.nextInt();
        }
        int result=findNumbers(array);
        System.out.println(result);
    }    
}
