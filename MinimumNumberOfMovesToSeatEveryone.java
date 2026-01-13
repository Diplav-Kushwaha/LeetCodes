public class Array17_MinimumNumberOfMovesToSeatEveryone {
    public static int minMovesToSeat(int[] seats, int[] students) {
            Arrays.sort(seats);
            Arrays.sort(students);

            int moves = 0;
            for (int i = 0; i < seats.length; i++) {
                moves += Math.abs(seats[i] - students[i]);
            }
            return moves;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int lenght1=sc.nextInt();
        int lenght2=sc.nextInt();

        int[] array1=new int[lenght1];
        for(int i=0; i<lenght1; i++){
            array1[i]=sc.nextInt();
        }
        int[] array2=new int[lenght2];
        for(int i=0; i<lenght1; i++){
            array2[i]=sc.nextInt();
        }
        int result=minMovesToSeat(array1, array2);
        System.out.println(result);
    }
}
