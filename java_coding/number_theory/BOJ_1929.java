package java_coding.number_theory;

import java.io.*;
import java.util.*;

public class BOJ_1929 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] mn = new int[m+n+1];


        for(int i=1;i<n+1;i++){
            if(mn[i]!=0) continue;

            if (i==1){
                mn[i]=1;
            }
            else{
                for(int j=2;j<n;j++){
                    int k = i*j;
                    if(k>n){break;}
                    mn[k]=1;
                }
            }
        }

        for(int i=m;i<n+1;i++){
            if(mn[i]==0){
                System.out.println(i);
            }
        }
    }
}
/*
 * 에라토스테네스의 체 : 소수 구하기 방법 (대표적)
 * 1~n까지 배열 생성
 * 1은 소수가 아니므로 삭제하고
 * 2부터 선택한 수의 배수를 모두 삭제
 * 이 후 지워지지 않은 수를 선택하고 배수 모두삭제
 * 반복해서 삭제되지 않은 수를 모두 출력
 * 
 * 시간복잡도 O(Nlog(logN))
 */