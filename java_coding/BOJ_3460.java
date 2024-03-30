package java_coding;

import java.io.*;
import java.util.*;

public class BOJ_3460 {
    public static void main (String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0;i<t;i++){

            int n = sc.nextInt();
            int cnt = 0;

            while(n>0){
                int b = n%2;

                if(b==1){
                    System.out.print(cnt+" ");
                }
                cnt++;
                n = n/2;
            }
            System.out.println();
        }

    }
}
