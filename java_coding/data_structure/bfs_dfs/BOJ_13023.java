package java_coding.data_structure.bfs_dfs;

import java.util.*;
import java.io.*;


// 친구 관계 파악하기
public class BOJ_13023 {

    static ArrayList<Integer>[] arr;
    static int answer ;
    
    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());

        arr=new ArrayList[node];

        for(int i=0;i<node;i++){
            arr[i] = new ArrayList<Integer>();
        }

        for(int i=0;i<edge;i++){
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }

        Boolean[] visited = new Boolean[node];
        Arrays.fill(visited,false);

        int depth = 1;
        answer = 0;

       

        for(int i=0;i<node;i++){
            dfs(visited,i,depth);
            if(answer==1){System.out.print(1);  return;}
        }
        System.out.print(0);   
    }

    public static void dfs(Boolean[] visited,int num,int depth){

        visited[num]= true ;

        if(depth>=5){
            answer = 1;
            return;
        }
        for(int a : arr[num]){
            if(visited[a]==false){
                dfs(visited,a,depth+1);
            }
        }
        visited[num]= false ; // 다른 루트에서도 탐색 가능하도록 false 처리
    }
}


// 깊이가 5이상인 경우를 찾아라 ->  dfs
