package java_coding.data_structure.sliding_window;

import java.util.*;
import java.io.*;

//최솟값 찾기
public class BOJ_11003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            // 현재 수보다 큰 수들은 필요 없으므로 덱에서 제거
            while (!deque.isEmpty() && deque.peekFirst() < i - L + 1) {
                deque.pollFirst();
            }

            // 현재 수보다 작은 수들은 필요 없으므로 덱에서 제거
            while (!deque.isEmpty() && arr[deque.peekLast()] > arr[i]) {
                deque.pollLast();
            }

            // 현재 수를 덱에 추가
            deque.offerLast(i);

            // 현재 창의 최솟값을 결과에 추가
            sb.append(arr[deque.peekFirst()]).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}