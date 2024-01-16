package java_coding.data_structure.stack_and_queue;

import java.io.*;
import java.util.*;


public class BOJ_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 수열의 길이
        int[] sequence = new int[n]; // 주어진 수열
        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int current = 1; // 스택에 push할 숫자

        for (int num : sequence) {
            // 스택이 비어있거나 스택의 맨 위 숫자가 현재 숫자보다 작을 때까지 push
            while (stack.isEmpty() || stack.peek() < num) {
                stack.push(current);
                result.append("+\n");
                current++;
            }

            // 스택의 맨 위 숫자가 현재 숫자와 같으면 pop
            if (!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                result.append("-\n");
            } else {
                // 만들 수 없는 경우
                System.out.println("NO");
                return;
            }
        }

        // 결과 출력
        System.out.println(result.toString());
    }
}


/*
 * 스택 : 나중에 들어온게 먼저 나감 (후입선출) / push(삽입) , pop(뺌,확인), peek(확인)  / ex ) 재귀
 * 큐 : 먼저 들어온게 먼저 나감 (선입선출) /  ex ) bfs
 */
