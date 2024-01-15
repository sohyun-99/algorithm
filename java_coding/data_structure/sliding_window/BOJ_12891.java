package java_coding.data_structure.sliding_window;

import java.util.*;
import java.io.*;

// DNA 비밀번호
public class BOJ_12891 {

    public static int find(char i){
        if(i=='A') return 0;
        else if(i=='C') return 1;
        else if(i=='G') return 2;
        else if(i=='T') return 3;
        
        return 4;
    }
 
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int s = Integer.parseInt(st.nextToken()); 
        int p = Integer.parseInt(st.nextToken()); 

        
        // 문자열로 입력받기
        char[] A = new char[s];
        A = bf.readLine().toCharArray();

        int[] standard = new int[4]; // 기준 값 담음
        int[] ACGT = new int[4]; // 현재 부분 구간 값 담음
        int count = 0;

        st = new StringTokenizer(bf.readLine());
        for(int i=0;i<4;i++){
            standard[i] = Integer.parseInt(st.nextToken()); 
        }

        for(int i=0;i<p;i++){
            ACGT[find(A[i])]++;; // 초기 부분단위 값 세팅
        }
    
        for(int i=0;i<(s-p+1);i++){

            if(ACGT[0]>=standard[0] && ACGT[1]>=standard[1] 
            && ACGT[2]>=standard[2] && ACGT[3]>=standard[3] ){
                count++;
            }
            

            ACGT[find(A[i])]--;

            if(i+p<s){
                ACGT[find(A[i+p])]++; // 다음꺼 미리 추가
            }
                     
        }
        System.out.println(count);
        }
    
}

/*
 슬라이딩 윈도우
 - 2개의 포인터로 범위를 지정한 후 다음 범위를 유지한 채로 이동하는 알고리즘 (투포인터와 유사)
*/

/*
 조건 1 : 문자열에 모든 문자가 배열DNA에 포함되야 함 => DNA 문자열
 조건 2 : DNA 문자열 -> 의 부분 문자열을 비밀번호로 사용
 조건 3 : DNA 문자열 : 조건을 주어 특정 개수 이상 인것만 가능
 조건 4 : A C G T 순서
 조건 5 : 부분 문자열 위치 다르면 : 문자열 내용 같아도 다른 문자열
*/ 

// int 형은 (2하고 0이 9개 ~ 이정도 느낌)