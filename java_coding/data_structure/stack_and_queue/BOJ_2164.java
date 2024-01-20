package java_coding.data_structure.stack_and_queue;

import java.io.*;
import java.util.*;


// 카드 게임
public class BOJ_2164 {
   public static void main(String[] args) throws IOException{

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bf.readLine());

    Queue<Integer> queue = new LinkedList<>();

    for(int i=1;i<n+1;i++){
        queue.offer(i);
    }

    while(queue.size()>1){
        queue.poll(); // 첫번째 요소 제거
        
        queue.offer(queue.poll()); // 두번째 요소 빼고 다시 넣기
    }

    System.out.println(queue.peek());


   } 
}
