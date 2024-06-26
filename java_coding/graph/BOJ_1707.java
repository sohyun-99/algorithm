package java_coding.graph;

import java.io.*;
import java.util.*;


//이분그래프
public class BOJ_1707 {

    public static int[] visited;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    // public static ArrayList<Integer> left = new ArrayList<Integer>();
    // public static ArrayList<Integer> right = new ArrayList<Integer>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E= Integer.parseInt(st.nextToken());


        visited = new int[V];
        
        
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0;i<E;i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v= Integer.parseInt(st.nextToken());

            graph.get(u).add(v); // 각각에 추가 해줌
            graph.get(v).add(u);
        }

        dfs(1);

    }

    public static void dfs(int n){

        visited[n] = 1 ;
        

        for(int i=0;i<graph.get(n).size();i++){
            
            int c = graph.get(n).get(i);

            if(visited[c]==0){
                visited[c]=-1;
                dfs(c);
            }

        }

    }
    
}
