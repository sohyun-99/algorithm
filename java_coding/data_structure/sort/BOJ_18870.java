package java_coding.data_structure.sort;

import java.io.*;
import java.util.*;

public class BOJ_18870 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 배열 복사 및 정렬
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        // 중복 제거 및 좌표 압축
        HashMap<Integer, Integer> compressionMap = new HashMap<>();
        int idx = 0;
        for (int num : sortedArr) {
            if (!compressionMap.containsKey(num)) {
                compressionMap.put(num, idx++);
            }
        }

        // 결과 출력
        StringBuilder result = new StringBuilder();
        for (int num : arr) {
            result.append(compressionMap.get(num)).append(" ");
        }

        System.out.println(result.toString());
    }
}
