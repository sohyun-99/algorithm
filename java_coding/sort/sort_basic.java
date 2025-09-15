import java.io.*;
import java.util.*;

public class sort_basic {

    public static void main(String[] args) throws IOException {
        NumberOrder();
        StringOrder();
    }
    
    private static void NumberOrder() {
        Integer[] arr = {1,2,3,4,5};
        Arrays.sort(arr); // 오름차순 정렬
        Arrays.sort(arr, Collections.reverseOrder()); // 내림차순 정렬
    
        System.out.println("정렬 1단계");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void StringOrder() {
        String[] arr = {"apple","ban","canada"};
        Arrays.sort(arr,(a,b) -> a.length() - b.length()); // 큰 값이 왼쪽에 가도록한다
        for (String a : arr) {
            System.out.print(a + " ");
        }
    }

}
