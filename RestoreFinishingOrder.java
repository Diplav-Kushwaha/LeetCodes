class Solution {
    public static int[] recoverOrder(int[] order, int[] friends) {
        int[] result=new int[friends.length];
        int k=0;
        for(int i=0; i<order.length; i++){
            for(int j=0; j<friends.length; j++){
                if(order[i]==friends[j]){
                    result[k]=order[i];
                    k++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();

        int[] order=new int[n];
        int[] friend=new int[m];

        for(int i=0; i<n; i++){
            order[i]=sc.nextInt();
        }
        for(int i=0; i<m; i++){
            friend[i]=sc.nextInt();
        }
        int[] result=recoverOrder(order, friend);
        for(int i=0; i<m; i++){
            System.out.print(result[i]);
        }
    }
}
