package java_coding.data_structure.stack_and_queue;

import java.util.*;
import java.io.*;

public class BOJ_17298 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int[] A = new int[n];
        for(int i =0 ; i<n ; i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        int[] Answer = new int[n];
        
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(0);

        for(int i =1; i<n ; i++){

            if (!stack.isEmpty()){
                // 큰 수가 아니라면 그냥 푸쉬
                if(A[stack.peek()]>=A[i] ){
                    stack.push(i);
                }
                else{
                    // 현재 top의 값이 다음의 나온 수들보다 작다면 pop
                    while(A[stack.peek()]<A[i]){
                        Answer[stack.pop()]=A[i];
                        if(stack.isEmpty()){break;}
                    }
                    stack.push(i);
                    
                }
            }
            else{
                stack.push(i);
            }
            
            
        }
        
        while(!stack.isEmpty()){
            Answer[stack.pop()]=-1;
        }

        // 시간 초과
        // for(int i=0;i<n;i++){
        //     System.out.print(Answer[i]+" ");
        // }


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<n;i++){
            bw.write(Answer[i]+" ");
        }
        bw.write("\n");
        bw.flush();

    }
}

//System.out.print를 반복적으로 사용하기 때문에 시간 초과 발생
// 대량의 출력이 필요한 경우 Buffered Writer를 사용하자
// 단 bw.write(string형이어야함 위의 경우는 공백을 더했기 때문에 문자열이 된 것)

