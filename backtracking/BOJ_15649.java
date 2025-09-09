package backtracking;

import java.io.*;
import java.util.*;

// n과 m (1)
public class BOJ_15649 {

    static int m ;
    static int n ;


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int check[] = new int[n+1]; // default = 0 

        for(int i=1;i<n+1;i++){
            // System.out.println("입장"+i);

            check[i]=1; 
            functionP(i,1,check,Integer.toString(i));
            check[i]=0;    
        }
    }

    public static void functionP(int i , int depth, int[] check,String answer){

        if(depth==m){
            System.out.println(answer);
            answer = "";
            return;
        }

        for(int j=1;j<n+1;j++){
            if(check[j]==0){
                check[j]=1;
                functionP(j, depth+1, check, answer+" "+j);
                check[j]=0;

            }
        }
        
    }
}
