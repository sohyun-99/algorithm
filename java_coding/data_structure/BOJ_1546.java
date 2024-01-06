package java_coding.data_structure;

import java.util.*;
import java.io.*;

// 평균
public class BOJ_1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n의 크기를 가진 배열 A 생성
        int A[] = new int[n];
        for ( int i = 0 ; i <n ; i++){
            A[i] = sc.nextInt();
        }

        long sum = 0 ;
        long max = 0 ;

        for ( int i = 0 ; i<n ; i ++){
            if ( A[i]>max ) max = A[i] ; // 최대 값 갱신
            sum += A[i];  // 전체 합 구하기
        }

        // 100.0 => double 형 -> 더 큰 자료형으로 형변환
        System.out.print(sum*100.0/max/n);

    }
}
