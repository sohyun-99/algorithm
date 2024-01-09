package java_coding.data_structure.prefix_sum;

import java.io.*;
import java.util.*;

//구간합 구하기 2
public class BOJ_11660 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int q = Integer.parseInt(stringTokenizer.nextToken());

        long S[][] = new long[n+1][n+1]; 

        for(int i=1;i<n+1;i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j=1;j<n+1;j++){
                int a = Integer.parseInt(stringTokenizer.nextToken());
                S[i][j]=S[i-1][j]+S[i][j-1]-S[i-1][j-1]+a;
            }
            
        }

        for(int i=0;i<q;i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());
            
            System.out.println(S[x2][y2]-S[x1-1][y2]-S[x2][y1-1]+S[x1-1][y1-1]);

        }

    }    
}

/* 문제 분석
    쉽게 떠올릴수 잇는것은 이중포문을 사용하는 방법인데 시간 제한이 1초이므로
    => 최대 1000*1000을 이중포문으로 돌려야하는 경우엔 시간초과 
    => 전체 합을 구한다는 점을 보아 부분합을 쓸 수 있다고 생각해야 함 
*/

/*
    문제점 : 이 문제의 부분합 풀이를 떠올리는데 시간이 상당히 오래 걸렸는데 이유는 처음 경우의 수 부터 차근차근 따져보면 되는데 그러지 않고 미지수의 값을 넣어본것
    해결 방안 : 아주 쉬운 상황의 값의 풀이부터 차근차근 풀어나가보자
*/
