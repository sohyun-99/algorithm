package java_coding.data_structure.bfs_dfs;

import java.util.*;
import java.io.*;

// 신기한 소수 찾기
public class BOJ_2023 {

    // private static ArrayList<Integer> result = new ArrayList<>();
    private static int n ;
    private static int[] start = {2,3,5,7};
    private static int[] next = {1,3,5,7,9};

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=0 ; i<4 ; i++){
            // result.add(start[i]);
            cal(start[i]); // 첫번째 수를 정해서 보냄
        
        }
    }

    //부분이 소수인 것만 num에 들어옴
    private static int cal(int num){

        int num2=0;

        if(isPrime(num)){
            if(Integer.toString(num).length()<n){
                {
                    for(int j=0;j<5;j++){
                        if(isPrime(num)){
                        num2 = num * 10 +next[j];
                        cal(num2);
                        }
                    }
                }   
            }
            if (Integer.toString(num).length()==n){
                System.out.println(num);
                // result.add(num);
                return 0;
            }
        }  
        return 0;         
        }

    // 소수 판별 함수
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// n이 최대 8이므로 그렇게 크지 않음 : 체크

/*
소수인지 아닌지 => 2부터 number의 제곱근까지의 수로 나누어 떨어지면 소수가 아님

    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            return false; // 나누어 떨어지면 소수가 아님
        }
    }
 */

 // 2가 들어갔어 -> 2에 1,3,5,7,9를 돌아가면서 넣어 -> 21 일때 소수인지 아닌지 판단해 -> 소수이면 한자리 더 붙혀 -> 1,3,5,7,9를 돌아가면서 넣어 -> 언제까지 ? 길이가 n보다 작을때까지
