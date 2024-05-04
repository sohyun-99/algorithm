package backtracking;

import java.io.*;
import java.util.*;

//N과 M (3)
public class BOJ_15651 {
    static int N, M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        arr = new int[M];
        
        dfs(0);
        System.out.println(sb);
    }
    
    static void dfs(int depth) {
        if (depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }
        
        for (int i = 1; i <= N; i++) {
            arr[depth] = i; // 현재 깊이를 인덱스로 하는 위치에 i 값을 넣는다.
            dfs(depth + 1); // 다음 자식 노드 방문을 위해 깊이를 1 증가시키고 재귀 호출
        }
    }
}
