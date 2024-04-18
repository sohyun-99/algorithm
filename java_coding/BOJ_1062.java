package java_coding;

import java.io.*;
import java.util.*;

public class BOJ_1062 {
    static int N, K;
    static boolean[] visited;
    static String[] words;
    static int max = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        words = new String[N];
        visited = new boolean[26];
        visited['a' - 'a'] = true;
        visited['n' - 'a'] = true;
        visited['t' - 'a'] = true;
        visited['i' - 'a'] = true;
        visited['c' - 'a'] = true;

        if (K < 5) {
            System.out.println(0);
            return;
        } else if (K == 26) {
            System.out.println(N);
            return;
        }

        for (int i = 0; i < N; i++) {
            words[i] = br.readLine().replaceAll("anta|tica", "");
        }

        visited['a' - 'a'] = false;
        visited['n' - 'a'] = false;
        visited['t' - 'a'] = false;
        visited['i' - 'a'] = false;
        visited['c' - 'a'] = false;

        dfs(0, 0);

        System.out.println(max);
    }

    static void dfs(int alpha, int count) {
        if (count == K - 5) {
            int readable = 0;
            for (int i = 0; i < N; i++) {
                boolean isReadable = true;
                for (int j = 0; j < words[i].length(); j++) {
                    if (!visited[words[i].charAt(j) - 'a']) {
                        isReadable = false;
                        break;
                    }
                }
                if (isReadable) {
                    readable++;
                }
            }
            max = Math.max(max, readable);
            return;
        }

        for (int i = alpha; i < 26; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i, count + 1);
                visited[i] = false;
            }
        }
    }
}
