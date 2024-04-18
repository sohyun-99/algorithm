package java_coding;

import java.io.*;
import java.util.*;

//연산자 끼워넣기 (재귀 대표 유형)
public class BOJ_14888 {

    public static int n;
    public static int max = Integer.MIN_VALUE;;
    public static int min = Integer.MAX_VALUE;


    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        int arr[] = new int[n];
        int cal[] = new int[4]; // +,-,*,/

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++){
            cal[i]=Integer.parseInt(st.nextToken());
        }

        relay(0,arr,cal,arr[0]);

        System.out.println(max);
        System.out.println(min);


    }

    public static void relay(int a, int arr[],int cal[],int answer){

        if(a>n-2){
            max = Math.max(max,answer);
            min = Math.min(min,answer);
            return;
        }

        // 남는 연산자를 하나 고르고
        for(int i=0;i<4;i++){
            if(cal[i]!=0){
                cal[i]--;
                relay(a+1, arr, cal,calculate(answer,arr[a+1],i));
                cal[i]++;
            }
        }
    }

    public static int calculate(int a,int b,int i){
        switch(i){
            case 0 : return a+b; 
            case 1 : return a-b;
            case 2 : return a*b;
            case 3 : return a/b;
            default : return -1;
        }
    }
}

