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

        // long[] arr = new long[1000001];
        long[] arr = new long[(int)(max - min + 1)];
        
        // arr에 순서대로 min~max 값을 저장
        int j =0;
        for(long i=min;i<=max;i++){
            arr[j]=i;
            j++;
        }

        // for(int i=2 ; i<=Math.sqrt(max);i++){

        //     long k = i*i;

        //     // if(k>=min && k<=max){
        //     //     if(arr[(int)(k-min)]==0) continue;
        //     // }
        //     long start = min/k * k;
        //     if(start<min) start+=k;
        //     // if(kk==0) kk=1;
            
        //     for(long q=start;q<=max;q=q+k){
        //         // if(q-min>=0) {
        //             arr[(int)(q-min)]= 0 ;
        //         // }
        //     }
            
        // }

        for(long i=2 ; i<=Math.sqrt(max);i++){
        // for (long i = 2; i*i <= max; i++) {
            long k = i * i;
            long start = min / k * k;
            if (start < min) start += k;

            for (long q = start; q <= max; q += k) {
                if (arr[(int)(q - min)] != 0) { // 이미 0으로 설정된 경우를 제외
                    arr[(int)(q - min)] = 0; // 제곱수의 배수를 0으로 설정
                }
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