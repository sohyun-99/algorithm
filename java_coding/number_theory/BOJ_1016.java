package java_coding.number_theory;

import java.io.*;
import java.util.*;

// 제곱이 아닌 수 찾기
public class BOJ_1016 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 값의 범위가 매우 크므로 long으로 자료형 사용
        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());
        long count = 0;

        long[] arr = new long[(int)(max - min + 1)];

        // arr에 순서대로 min~max 값을 저장
        int j =0;
        for(long i=min;i<=max;i++){
            arr[j]=i;
            j++;
        }

        // Boolean을 사용하여 메모리 효율성 높히는 방법이 더 유용
        // boolean[] isSquareFree = new boolean[(int) (max - min + 1)];
        // Arrays.fill(isSquareFree, true);

        for(long i=2 ; i<=Math.sqrt(max);i++){
        // for (long i = 2; i*i <= max; i++) {
            long k = i * i;
            long start = min / k * k;
            if (start < min) start += k;

            for (long q = start; q <= max; q += k) {
                    arr[(int)(q - min)] = 0; // 제곱수의 배수를 0으로 설정
            }
        }

        for(int i=0;i<=(max-min);i++){
            if(arr[i]!=0){
                count++;
            }
        }
        System.out.println(count);

    }
}