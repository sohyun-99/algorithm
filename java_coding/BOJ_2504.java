package java_coding;

import java.io.*;
import java.util.*;

// 괄호의 값 (스택 이용 문제)
public class BOJ_2504 {
    public static void main (String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
            String str = br.readLine();
            int answer = 0 ;
            int tmp = 1;

            String[] strArr = str.split("");  // 리스트로 변경

            Stack<String> stack = new Stack<>();

            for(int i=0;i<strArr.length;i++){
                
                if(strArr[i].equals("(")){
                    stack.push(strArr[i]);
                    tmp*=2;
                }
                else if(strArr[i].equals("[")){
                    stack.push(strArr[i]);
                    tmp*=3;
                }
                else if((strArr[i].equals(")"))){
                    if(stack.isEmpty() || !stack.peek().equals("(")){
                        answer=0;
                        break; 
                    }
                    else{
                        if(strArr[i-1].equals("(")){
                            answer+=tmp;
                        }
                        stack.pop();
                        
                        tmp /= 2;
                    }
                }
                else if((strArr[i].equals("]"))){
                    if(stack.isEmpty() || !stack.peek().equals("[")){
                        answer = 0;
                        break; 
                    }
                    else{
                        if(strArr[i-1].equals("[")){
                            answer+=tmp;
                        }
                        stack.pop();
                        
                        tmp /= 3;
                    }
                }
            }

        if(!stack.isEmpty()) System.out.println(0);
        else System.out.println(answer);
        
    }
}


/*
 * 스택
 * Stack<String> stack = new Stack<>();
 * push , peek , pop

 */