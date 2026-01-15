class Solution {
    public static long maxSpending(int[][] values) {

        int m = values.length;
        int n = values[0].length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );
        for (int i = 0; i < m; i++) {
            pq.offer(new int[]{values[i][n - 1], i, n - 1});
        }

        long day = 1;
        long total = 0;
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int val = curr[0];
            int row = curr[1];
            int col = curr[2];
            total += val * day;
            day++;
            if (col - 1 >= 0) {
                pq.offer(new int[]{values[row][col - 1], row, col - 1});
            }
        }

        return total;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int row=sc.nextInt();
        int column=sc.nextInt();

        int[][] array=new int[row][column];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                array[i][j]=sc.nextInt();
            }
        }

        long result=maxSpending(array);
        System.out.println(result);
    }
}
