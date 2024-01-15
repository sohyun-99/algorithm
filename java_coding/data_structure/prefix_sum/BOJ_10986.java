package java_coding.data_structure.prefix_sum;

import java.io.*;
import java.util.*;

// 나머지 합
public class BOJ_10986 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long S[]=new long[n+1];
        long count[]=new long[m]; // 나머지가 최소 0~ 최대 m-1까지 존재

        st = new StringTokenizer(br.readLine());
        long answer=0;

        for(int i=1 ;i<n+1;i++){
            int a = Integer.parseInt(st.nextToken());
            S[i]=S[i-1]+a ;
            int cnt = (int)(S[i]%m);
            if(cnt==0)  answer++;
            // 나머지가 같을 경우 => nC2(조합)만큼의 경우의 수 발생
            // int로 형 맞춰줌
            count[cnt]++; 
        }

        for(int i=0;i<m;i++){
            if (count[i]>1){
                answer+=(count[i]*(count[i]-1)/2);
            }
        }
        System.out.print(answer);
    }
    
}

/*
 스스로 작성한 알고리즘 = 시간초과 해결 X
 답안을 참고했는데 이 풀이를 스스로 생각해낸다는거 자체가 가능한가 싶었음 / 이런 풀이가 있다는 것을 알아두면 나중에 좋을 듯
 
 수학적인 계산
 (S[j] − S[i−1]) % M =0
 (S[j] % M) − (S[i−1] % M) =0
 S[j] % M= S[i−1] % M


 */

 /*
  추가로 계속 런타임 에러가 나서 도무지 이유룰 모르겠었는데 
  answer가 int형이라서 계산 값이 크다보니 범위를 넘어갔었다
  
  해결 : int -> long
  */
