class Solution {
    static int cycle;
    static boolean[][] visited;
    static int[][] network;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        cycle = n;
        visited = new boolean[n][n];
        network = computers;
             
        for( int i = 0; i<n; i++){
            for( int j = 0; j<n; j++){
                if( !visited[i][j] && network[i][j] == 1){
                    dfs(i, j);
                    answer++;
                }
            }
        }
        
        return answer;
        
    }
    
    static void dfs(int y, int x){
        visited[y][x] = true;

        for( int i = 0; i<cycle; i++){

            if( !visited[x][i] && network[x][i] == 1 ){
                dfs(x, i);
            }
        }

    }
}