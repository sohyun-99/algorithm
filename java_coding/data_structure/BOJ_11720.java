package java_coding.data_structure;

import java.util.*;
import java.io.*;

// 숫자의 합 구하기
public class BOJ_11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        // 공백을 포함하지 않는 문자열을 입력 받음
        String sNum = sc.next();

        char[] cNum = sNum.toCharArray();
        
        int sum = 0;
        for ( int i = 0 ; i <cNum.length ; i++){
            // char(문자) 를 정수형으로 변환하여 값을 더해 나감
            sum += cNum[i] - '0';
        
        }
        System.out.print(sum);

    }
}
