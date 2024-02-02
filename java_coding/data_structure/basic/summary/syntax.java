package java_coding.data_structure.basic.summary;

import java.io.*;
import java.util.*;

public class syntax {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* arraylist */

        // arraylist 복사
        ArrayList<Integer> arrlist1 = new ArrayList<Integer>();
        ArrayList<Integer> copy_arrlist1 = new ArrayList<Integer>();
        copy_arrlist1.addAll(arrlist1);

        // arrayList 정렬
        arrlist1.sort(null);

        /* List */

        // set을 list로 변경
        Set<String> set1 = new HashSet<String>();
        List<String> list1 = new ArrayList<String>(set1);

        // list를 sort
        List<Integer> list2 = new ArrayList<>();
        Collections.sort(list2);

        //list를 add <- arraylist도 list이므로 같음
        list2.add(1);

        //list를 remove <- 인덱스로 삭제
        list2.remove(list2.size()-1); // 마지막 요소 삭제
        
        //List 크기 <- arraylist도 list이므로 같음
        arrlist1.size();
        
        /* array */
        
        // array sort
        int[] arr1 = new int[5];
        Arrays.sort(arr1);

        // array length
        int length = arr1.length;

        // array String -> char
        char[][] char1 = new char[5][5];
        
            // string -> 입력을 직접 받을 경우
            for(int i=0;i<5;i++){
                char1[i]=br.readLine().toCharArray();
            }

            // String 배열을 전환하는 경우
            String str1 = "12345";
            char1[0] = str1.toCharArray();

        // array 배열 자르기
        int[] arr2 = {1,2,3,4,5};
        int[] cut_arr2 =  Arrays.copyOfRange(arr2,2,4); //<-인덱스로 // 결과 (3,4) // 인덱스 2부터 4전까지 
        

        /* set */

        //set 값 넣기 삭제 크기
        Set<String> set2 = new HashSet<String>();
        set2.add("input");
        set2.remove("input"); // <- 순서가 없으므로 값으로 삭제
        set2.size();

        // set 값 조회
        Iterator<String> iter1 = set2.iterator();
        while(iter1.hasNext()){
            System.out.println(iter1.next()); 
        }

        /* map */

        // map 삽입 가져오기 크기
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("str",1);
        map1.get("str"); // value출력
        map1.size();

        // map key값이  존재하는지 확인
        map1.containsKey("str");  // true , false 반환

        // map 값 조회
        Iterator<String> it2 = map1.keySet().iterator();
        while(it2.hasNext()){
            String key = it2.next();
            int value = map1.get(key);            
        }
    
        //value에 collection 삽입

        Map<String,List<Integer>> map2= new HashMap<>();
        
        // 비어있는 맵일 경우
        if(map2.containsKey("str")==false){
            List<Integer> list3 = new ArrayList<>();
            list3.add(3);
            map2.put("str",list3);

        }
        map2.get("str").add(Integer.parseInt("넣고싶은거"));
    }


    
}

//참고 : https://gwang920.github.io/java/Java-condingGrammer/