package java_coding;

import java.io.*;
import java.util.*;

public class BOJ_1292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sequence = new int[1001]; 
        int sum = 0;
        int num = 1; 
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        
        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < i; j++) {
                sequence[num++] = i;
                if (num > 1000) 
                    break;
            }
            if (num > 1000)
                break;
        }
        
        for (int i = start; i <= end; i++) {
            sum += sequence[i];
        }
        
        System.out.println(sum);
    }
}
