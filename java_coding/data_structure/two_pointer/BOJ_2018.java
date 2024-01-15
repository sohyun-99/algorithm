

import java.util.Scanner;

//수들의 합 5
public class BOJ_2018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int start = 1;
        int end = 1;

        int cnt = 1;
        int sum = 1;


        while(end<n){            
            if(sum==n){
                cnt++;
                end++;
                sum+=end;
            }
            else if(sum>n){
                sum-=start;
                start++;
            }
            else{
                end++;
                sum+=end;

            }
        }
        System.out.println(cnt);
    }
}

/* 투포인터 이동원칙
    sum > N : sum = sum - start_index; start_index++
    sum < N : end_index++; sum = sum + end_index;
    sum == N : end_index++; sum = sum + end_index; count++;
 */