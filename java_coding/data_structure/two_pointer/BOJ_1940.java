package java_coding.data_structure.two_pointer;

import java.io.*;
import java.util.*;

// 주몽의 명령
public class BOJ_1940 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        // 바로 입력 받아오기
        int n = Integer.parseInt(bf.readLine());
        int m = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int[] nNum = new int[n];
        for(int i =0;i<n;i++){
            nNum[i]=Integer.parseInt(st.nextToken());
        }

        // 정렬 오름차순
        Arrays.sort(nNum);

        //처음과 끝점을 기준으로 시작
        int start =0;
        int end =n-1;
        int cnt =0;
        int sum =0;

        
        while(start<end){
            // System.err.println("("+start+" "+end+")"+);

            sum = nNum[start]+nNum[end];
            if(sum==m){
                // System.err.println(start+" "+end);
                end--;
                cnt++;
            }
            else if(sum<m){
                start++;
            }
            else{
                end--;
            }

        }
    
    System.out.println(cnt);
    }
   
}

/*
시간 복잡도 고려 : n의 최대 범위 15000 -> O(nlogn) 시간복잡도 써도 문제 없음 
                // 기본 정렬 알고리즘의 시간 복잡도는 O(nlogn) 
*/ 