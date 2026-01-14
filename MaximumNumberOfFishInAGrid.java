    public static int findMaxFish(int[][] grid) {
        int maxFish = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] > 0) {
                    int currentFish = dfs(grid, i, j);
                    maxFish = Math.max(maxFish, currentFish);
                }
            }
        }
        return maxFish;
    }

    private static int dfs(int[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }
        int fish = grid[r][c];
        grid[r][c] = 0;

        fish += dfs(grid, r + 1, c);
        fish += dfs(grid, r - 1, c);
        fish += dfs(grid, r, c + 1);
        fish += dfs(grid, r, c - 1);

        return fish;
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
        int result=findMaxFish(array);
        System.out.println(result);
    }
