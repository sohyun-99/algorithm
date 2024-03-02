package java_coding.bfs_dfs;

import java.io.*;
import java.util.*;

public class BOJ_1697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int[] visited = new int[100001];
        bfs(N, K, visited);

        br.close();
    }

    private static void bfs(int start, int target, int[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = 1;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == target) {
                System.out.println(visited[current] - 1);
                return;
            }

            if (current - 1 >= 0 && visited[current - 1] == 0) {
                queue.offer(current - 1);
                visited[current - 1] = visited[current] + 1;
            }

            if (current + 1 <= 100000 && visited[current + 1] == 0) {
                queue.offer(current + 1);
                visited[current + 1] = visited[current] + 1;
            }
            // 순간이동
            if (current * 2 <= 100000 && visited[current * 2] == 0) {
                queue.offer(current * 2);
                visited[current * 2] = visited[current] + 1;
            }
        }
    }
}
