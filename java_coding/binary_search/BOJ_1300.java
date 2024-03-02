package java_coding.binary_search;

import java.io.*;
import java.util.*;

// K번째 수
public class BOJ_1300 {

    static int n ; 
    static int k ; 


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        int start = 1 ;
        int answer=0;
        int end = k;

        while(start<end){
            int mid = (start+end)/2;
            int sum = 0;
            for(int i=1;i<n+1;i++){
                sum+=Math.min(n,mid/i);
            }
    
            if(sum>=k){
                end = mid;    
            }else if(sum<k){
                start = mid+1;
            }
        }

        System.out.println(start);
    }
}
