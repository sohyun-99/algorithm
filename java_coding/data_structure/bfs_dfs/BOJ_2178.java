package java_coding.data_structure.bfs_dfs;

import java.util.*;
import java.io.*;

public class BOJ_2178 {

    // 하 우 상 좌
    static int[] dx = {1,0,0,-1};
    static int[] dy = {0,1,-1,0};
    static int[][] arr;
    static int n,m;
    static int count = 0;
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        for(int i=0;i<n;i++){
            String a = br.readLine();

            for(int j=0;j<m;j++){
                arr[i][j] = Integer.parseInt(a.substring(j,j+1));
            }

        }
        
        bfs(0,0);

        System.out.println(arr[n-1][m-1]);

    }

    static void bfs(int x,int y){

        queue.offer(new int[] {x,y});

        while(!queue.isEmpty()){
            int[] xy = queue.poll();
            x = xy[0];
            y = xy[1]; 

            // System.out.println(x+" "+y);


            if(x==n-1 && y==m-1){
                return;
            }

            for(int i=0;i<4;i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
    
                if(nx<0 || ny<0 || nx>=n || ny>=m){
                    continue;
                }

                if(arr[nx][ny]==1){
                    queue.offer(new int[] {nx,ny});
                    arr[nx][ny]=arr[x][y]+1;
                }
            
            }
        }
    }

}
