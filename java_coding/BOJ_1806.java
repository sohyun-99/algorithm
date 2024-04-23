package java_coding;

import java.io.*;
import java.util.*;

public class BOJ_1806 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int start = 0, end = 0;
        int sum = arr[0];
        int minLen = Integer.MAX_VALUE;

        while (start <= end && end < N) {
            if (sum < S) {
                end++;
                if (end < N) sum += arr[end];
            } else {
                minLen = Math.min(minLen, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLen);
        }
    }
}

