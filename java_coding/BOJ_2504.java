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
                    if(stack.peek().equals("(")){
                        System.out.println("answer ="+ answer + "tmp = " +tmp );

                        if(strArr[i-1].equals("(")){
                            answer+=tmp;
                        }
                        stack.pop();
                        
                        tmp /= 2;
                    }
                    else{
                        break; // 짝을 이루지 않는 경우라 예외처리
                    }
                }
                else if((strArr[i].equals("]"))){
                    if(stack.peek().equals("[")){
                        stack.pop();
                        System.out.println("answer ="+ answer + "tmp = " +tmp );

                        if(strArr[i-1].equals("[")){
                            answer+=tmp;
                        }
                        
                        tmp /= 3;
                    }
                    else{
                        break; // 짝을 이루지 않는 경우라 예외처리
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