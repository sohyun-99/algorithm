package java_coding.greedy;

import java.io.*;
import java.util.*;


public class BOJ_11047 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int coin = 0 ;

        int[] a=new int[n];

        for(int i =0 ;i<n;i++){
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=n-1;i>=0;i--){

            if(k==0){
                break;
            }

            if(k<a[i]) continue;

            coin += k/a[i]; // 몫
            k=k%a[i]; // 나머지



        }
        System.out.println(coin);
    }
}

/*
 * 그리디는 현재 상태에서 가장 최선이라고 생각되는 해를 선택부터 시작 -> ...
 */