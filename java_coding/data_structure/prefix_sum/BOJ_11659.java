package java_coding.data_structure.prefix_sum;

import java.util.* ;
import java.io.*;

// 구간 합 구하기
public class BOJ_11659 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader 
            = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer 
            = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        // 인덱스 1부터 n까지로 사용하기 위해 n+1 크기로 만듦
        long[] S = new long[n+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        // S[0]=0 ;
        // S[0]값을 명시적으로 초기화하고 있지 않으면 => S[0]은 0으로 자동 초기화됩니다.
        // 합 배열
        for(int i=1;i<n+1;i++){
            int a = Integer.parseInt(stringTokenizer.nextToken());
            S[i]=S[i-1]+a;
        }

        // 원하는 부분 합 구하기 
        for(int q=0;q<m;q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            
            System.out.println(S[j]-S[i-1]);
        }
    }
    
}

/*
    합 배열 : S[i] = S[i-1] + A[i]
    구간 합 : S[j] - S[i-1] // i~j까지 구간의 합
 */

 /*
    자바로 입력 받기
    [ BufferedReader 과 Scanner ]

        BufferedReader : 대용량 데이터를 효율적으로 처리 / 단 모두 string의 형태로 받아옴 -> 추후 변형 필요
        Scanner : 사용자 입력을 다룰 때 더 편리하며, 간단한 형태의 입력 처리 

        => BufferedReader를 사용하는 것이 Scanner를 사용하는 것보다 빠르다

        + StringTokenizer : 구분자 기반으로 문자열 분할 (token으로 나누어짐)
  */