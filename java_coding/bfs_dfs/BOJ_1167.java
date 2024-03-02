package java_coding.bfs_dfs;

import java.io.*;
import java.util.*;

public class BOJ_1167 {

    static int[] visited ;
    static int max ; 
    static ArrayList<Integer>[] arr;

    public static void main(String[] args) throws IOException{


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        arr = new ArrayList[n];


        for(int i =0;i<n;i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = new ArrayList<Integer>();
            
            while(true){
                int num = Integer.parseInt(st.nextToken());
                if(num==-1){
                    break;
                }
                else{
                    arr[i].add(num);
                }
            }
        }

        max = 0;
        visited = new int[n];
        Arrays.fill(visited,0);

        bfs(0);


    }

    static void bfs(int v){
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(v);
        visited[v] = 1;

        while(!queue.isEmpty()){

            v = queue.poll();

            for(int i=0;i<arr[v].size();i+=2){
                queue.offer(arr[v].get(i));
                visited[v] = 1;

            }


        }



    }
    
}
