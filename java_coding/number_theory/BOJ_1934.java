package java_coding.number_theory;

import java.io.*;
import java.util.*;

public class BOJ_1934 {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());


        for(int i=0 ; i<t ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int ab = a*b;
            
            int c = 1;
            while(c!=0){
                c = Math.max(a, b) % Math.min(a, b) ;

                a = Math.min(a, b);
                b = c;
            }

            System.out.println(ab/a);
            
        }



    }
    
}

/*
 * 유클리드 호제법
 * 두 수의 최대 공약수를 구하는 알고리즘
 *  
 * 큰수 % 작은수 = 나머지
 *      작은수 % 나머지 = new 나머지
 *              나머지 % 나머지 =   
 *                      나머지가 0이 되는  순간의 작은수 = 최대 공약수
 * 
 * 최소 공배수 = 두수의 곱 / 최대공약수
 */
