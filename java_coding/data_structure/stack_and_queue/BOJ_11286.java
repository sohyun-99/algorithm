package java_coding.data_structure.stack_and_queue;

import java.util.*;
import java.io.*;


// 절댓값 힙 구현하기 **
public class BOJ_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        // 새로운 요소를 적절한 위치에 삽입하기 위함 //comparator 이용
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
                        
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            if(abs1 == abs2) return o1 > o2 ? 1 : -1; // 절댓값이 같으면 음수를 작은 값으로 판단
            return abs1 - abs2; // 양수이면 abs1이 더 큰거 음수면 abs2가 더 큰거
        });

        for(int i = 0 ; i < n; i++){

            int val = Integer.parseInt(br.readLine());

            if(val == 0){
                if(queue.isEmpty()){
                    System.out.println("0");
                }
                else{
                    System.out.println(queue.poll());
                }
            }else{
                queue.add(val);
            }
        }
    }
    
}

//최소힙 PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//최대힙 PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

//유선순위 큐 비교 : comparator 함수
// 리턴값  
//양수 : 첫번째 매개변수가 더 큰 값으로 판단
// 0 : 같은 값으로 판단
// 음수 : 첫번째 매개변수가 더 작은 값으로 판단
