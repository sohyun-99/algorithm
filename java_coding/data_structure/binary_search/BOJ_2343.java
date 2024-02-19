package java_coding.data_structure.binary_search;

import java.io.*;
import java.util.*;

// 기타레슨
/**  시간 초과 수정 완료 */
public class BOJ_2343 {

    static int[] arr ;

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        
        arr = new int[n];

        int start = 0;
        int end = 0;

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(start<arr[i]){
                start = arr[i];
            }
            end+=arr[i];
        }

        int answer = end;

        while(start<=end){
            int mid = (start+end)/2;
            int sum = 0 ;
            int count = 0 ;

            for(int i=0;i<n;i++){
                if(sum+arr[i] > mid){
                    sum = 0 ;
                    count++;
                }
                
                sum+=arr[i];
            }
            if(sum!=0){count++;}

            // 블루레이가 꼭 m개일 필요는 없지 -> m개 보다 작아도 됨 (그냥 비워두면 되니까) // 그걸 고려못해서 90%쯤에서 틀렸습니다가 떴음 !!
            if(count<=m){
                end = mid-1;
                if(answer>mid){
                    answer = mid;
                }
            }else{
                start=mid+1;
            }

        }
        System.out.println(answer);
    }
}

    //     answer_min = part_sum[m-1] ; 

    //     while(true){

    //         int max_index = find_part_sum_max(); // 제일 큰 값의 인덱스를 얻은거지

    //         if(max_index<1 || max_index>m){
    //             break;
    //         }

    //         if(part_index[max_index]==part_index[max_index-1]){
    //             break;
    //         }


    //         if(answer_min > part_sum[max_index]){
    //             answer_min = part_sum[max_index];
    //         }

    //         part_sum[max_index-1] += arr[part_index[max_index]];
    //         part_sum[max_index] -= arr[part_index[max_index]];



            
    //         part_index[max_index]+=1;
    //     }

    //     System.out.println(answer_min);

    // }

    // static int find_part_sum_max(){
    //     // 최댓값의 key값을 반환
    //     int max = 0;
    //     int max_index = 0 ;
    //     for(int i=0;i<part_index.length;i++){
    //         if(part_sum[i]>max){
    //             max = part_sum[i];
    //             max_index = i;
    //         }
    //     }
    //     return max_index;
    // }



