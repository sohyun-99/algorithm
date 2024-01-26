package java_coding.data_structure.sort;

import java.io.*;
import java.util.*;


//버블 소트 프로그램 1 *****
public class BOJ_1377 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        
        Pair[] A = new Pair[n];  // 인덱스와 값을 같이 담고 compareTo 함수를 사용하기 위해 클래스 배열로 선언

        for(int i=0;i<n;i++){
            A[i]=new Pair(Integer.parseInt(bf.readLine()),i);
        }

        Arrays.sort(A); // 배열정렬 하면서 compareTo 인덱스 값 갱신
        // 배열 정렬 시간 복잡도 nlogn

        int Max=0;
        for(int i=0;i<n;i++){
            System.out.println(A[i].index+" "+A[i].value);
            // 정렬 전 인덱스 A[i].index , 정렬 후 인덱스 i(오름차순 순서대로니까)
            // 둘을 비교하여 최댓값 == 앞으로 이동한 횟수 = 큰값들이 뒤로 가게 되는 횟수 == n번째 순환
            if(Max<A[i].index-i){
                Max = A[i].index-i;
            }
        }

        System.out.println(Max+1);
    }

}

class Pair implements Comparable<Pair>{
    int value;
    int index;

    public Pair(int value,int index){
        this.value= value;
        this.index=index;
    }

    //Comparable 인터페이스 구현시 compareTo 메소드를 반드시 재정의
    @Override
    public int compareTo(Pair p){
        return this.value-p.value; // value값을 기준으로 오름차순으로 정렬
    } 
    // 인덱스 값은 그대로 가지고 value를 기준으로 오름 차순으로 변하기 때문에
    // 정렬되기 전의 인덱스의 value = 정렬 된 후의 value가 같아짐

    // Comparable 인터페이스를 구현하는 것은 정렬이나 순서를 지정하는 경우에 필요한 기능
}

/*
 * 버블 정렬
 * 인접한 요소끼리 비교하고 swap 수행하며 정렬
 */

 // 냅다 그냥 버블 정렬 넣으면 시간 초과
// BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // int n = Integer.parseInt(bf.readLine());
        // int temp=0;
        // int[] A = new int[n+1];
        // for(int i=1;i<n+1;i++){
        //     A[i]= Integer.parseInt(bf.readLine());
        // }

        // boolean changed = false ;
        // for (int i=1; i<=n+1; i++) {
        //     changed = false;
        //     for (int j=1; j<=n-i; j++) {
        //         if (A[j] > A[j+1]) {
        //             changed = true;
        //             temp = A[j];
        //             A[j]=A[j+1];
        //             A[j+1]=temp;
        //             }
        //     }
        //     if (changed == false) {
        //         System.out.println(i);
        //         break;
        //     }
        // }

