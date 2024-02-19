package java_coding.data_structure.binary_search;

import java.io.*;
import java.util.*;


public class BOJ_2343 {

    static int[] arr ;
    static int answer_min;
    // static Map<Integer,Integer> part_sum;
    static int[] part_index;
    static int[] part_sum;


    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        
        arr = new int[n];
        part_index = new int[m];
        part_sum = new int[m];


        // 초기 값 세팅
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(i>=m-1){ // 마지막 합 요소
                part_sum[m-1]+=arr[i];
                part_index[m-1] = m-1 ;
            }else if(i<m-1){
                part_sum[i] = arr[i];
                part_index[i] = i;
            }
        }

        answer_min = part_sum[m-1] ; 

        while(true){

            int max_index = find_part_sum_max(); // 제일 큰 값의 인덱스를 얻은거지

            if(max_index<1 || max_index>m){
                break;
            }

            if(part_index[max_index]==part_index[max_index-1]){
                break;
            }


            if(answer_min > part_sum[max_index]){
                answer_min = part_sum[max_index];
            }

            part_sum[max_index-1] += arr[part_index[max_index]];
            part_sum[max_index] -= arr[part_index[max_index]];

            
            part_index[max_index]+=1;
        }

        System.out.println(answer_min);

    }

    static int find_part_sum_max(){
        // 최댓값의 key값을 반환
        int max = 0;
        int max_index = 0 ;
        for(int i=0;i<part_index.length;i++){
            if(part_sum[i]>max){
                max = part_sum[i];
                max_index = i;
            }
        }
        return max_index;
    }
}


