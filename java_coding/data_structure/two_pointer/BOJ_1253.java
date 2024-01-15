package java_coding.data_structure.two_pointer;

import java.io.*;
import java.util.*;


//좋은 수 구하기 // 좋다
public class BOJ_1253 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());
        

        long[] nNum = new long[n];
        for (int i=0;i<n;i++){
            nNum[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(nNum);

        int cnt=0;

        for(int i=0;i<n;i++){
            // i를 판별하겠다
            int start = 0; // start only ++
            int end = n-1; // end only --
            while(start < end){
                long sum = nNum[start]+nNum[end];
                if(start==i){
                    start++;
                    continue;
                }
                else if(end==i){
                    end--;
                    continue;
                }

                if(sum<nNum[i]){
                    start++;
                }
                else if(sum==nNum[i]){
                    cnt++;
                    break;
                }
                else{
                    end--;
                }
            }
        }
    
    System.out.println(cnt);

    }
}

/*
 첫 도전 시 틀림 이유 : 다른 두 수 라는 조건이 있었는데 그 조건을 체크하는 부분은 없음 (나를 제외) / 그리고 조건에 절댓값으로 표시되어 음수 일 수도 있는 경우를 배제
 > 모든조건을 번호로 메겨 빼먹는 것이 없도록 하자
 */
