package java_coding;

import java.io.*;
import java.util.*;


// 약수 구하기 
public class BOJ_2501 {

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for(int i=1;i<=n;i++){
            int a = n%i;
            if(a==0){
                cnt++;
            }
            if(cnt==k){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);

    }
    
}
