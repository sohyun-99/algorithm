package java_coding.binary_search;

import java.io.*;
import java.util.*;

public class BOJ_1920 {

    static int arr[];

    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n  = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        arr= new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m  = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        

        for(int i=0;i<m;i++){
            int find = Integer.parseInt(st.nextToken());
            int answer =binary_search(find,0,arr.length-1);
            System.out.println(answer);
        }

    }

    static int binary_search(int find,int start,int end){
        
        int mid = (start+end) / 2 ;

        if(start>end){
            return 0;
        }

        if(find==arr[mid]){
            return 1;
        }else if(find>arr[mid]){
            return binary_search(find, mid+1, end);
        }
        else{
            return binary_search(find, start, mid-1);
        }

    }
    
}