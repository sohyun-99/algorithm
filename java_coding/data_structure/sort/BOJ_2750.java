package java_coding.data_structure.sort;

import java.io.*;
import java.util.*;

// 수 정렬하기 1
public class BOJ_2750 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());


        int A[] = new int[n];
        for(int i=0;i<n;i++){
            A[i]=Integer.parseInt(bf.readLine());
        }

        Arrays.sort(A);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<n;i++){
            bw.write(Integer.toString(A[i]));
            bw.write("\n");
        }
        bw.flush();
    }

    
}

