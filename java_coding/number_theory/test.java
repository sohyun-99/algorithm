package java_coding.number_theory;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[10000001];

        for (int i = 2; i < A.length; i++) {
            A[i] = i;
        }

        // N의 범위까지 소수 구하기
        for (int i = 2; i < Math.sqrt(A.length); i++) {
            if (A[i] == 0) {
                continue;
            }
            for (int j = i + i; j < A.length; j = j + i) {
                A[j] = 0;
            }
        }

        int i = N;
        while (true) {
            // N부터 1씩 증가시키면서 소수와 팰린드롬 수가 맞는지 확인하기
            if (A[i] != 0) {
                int result = A[i];
                if (changeN(result)) {
                    System.out.println(result);
                    break;
                }
            }
            i++;
        }
    }
    
    static boolean changeN(int n){
        
        char t[] = String.valueOf(n).toCharArray();
        int  s = 0;
        int e = t.length-1;
        while(s<e){
            if(t[s]!=t[e]){
                return false;
            }
            s++;
            e--;
        }
        return true;

        
        // int k =n;
        // int count=0;
        // while(n>0){
        //     n/=10;
        //     count++;
        // }

        // int[] digits = new int[count];
        // for (int i = count - 1; i >= 0; i--) {
        //     digits[i] = k % 10;
        //     k /= 10;
        // }


        // for(int i=0;i<count/2;i++){
        //     if(digits[i]!=digits[count-1-i]){
        //         return false;
        //     }
        // }
        // return true;
    }
}
