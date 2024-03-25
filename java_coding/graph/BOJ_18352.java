package java_coding.graph;

import java.io.*;
import java.util.*;

// 특정 거리의 도시 찾기
public class BOJ_18352 {

    public static int[] visited ;
    public static ArrayList<ArrayList<Integer>> graph;
    public static int count ; 


    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());


        // 초기화 (할당)
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i =0;i<=N;i++){
            graph.add(new ArrayList<>());
        }

        visited = new int[N+1];
        for(int i=0;i<visited.length;i++){
            visited[i]=-1;
        }

        // 값 입력 후 저장
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
        }

        bfs(K,X);

        for(int i=0;i<visited.length;i++){
            if(visited[i]==K){
                count++;
                System.out.println(i);
            }
        }

        if(count==0){
            System.out.println(-1);
        }

    }

    public static void bfs(int K , int X){

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(X);
        visited[X] = 0;
        
        while(!queue.isEmpty()){
            int p = queue.poll();   
            for(int n: graph.get(p)){
                if(visited[n]==-1){
                    queue.offer(n);
                    visited[n]=visited[p]+1; 
                }                
                 
            }
        }
    }
    
}
