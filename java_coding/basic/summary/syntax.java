package java_coding.basic.summary;

// 라이브러리 선언
import java.io.*;
import java.util.*;

public class syntax {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        System.out.println("coding test");
        
        String();
    }

    /* arraylist */
    public static void arrayList(){
        // arraylist 복사
        ArrayList<Integer> arrlist1 = new ArrayList<Integer>();
        ArrayList<Integer> copy_arrlist1 = new ArrayList<Integer>();
        copy_arrlist1.addAll(arrlist1);

        // arrayList 정렬
        arrlist1.sort(null);
        arrlist1.size();
    }

    /* List */
    public static void list(){

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
        list1.size();
    }
    
    /* array */
    public static void array() throws IOException {
        // array sort
        int[] arr1 = new int[5];
        Integer[] arr3 = new Integer[5];


        Arrays.sort(arr1);
        Arrays.sort(arr3,Collections.reverseOrder());
        Arrays.sort(arr1,0,4);

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

        //초기값을 false로 초기화
        Boolean arr [] = new Boolean[10];
        Arrays.fill(arr,false); 

        List list1 = Arrays.asList(arr);
        int[] arr4 = Arrays.copyOfRange(arr1,0,1);
    }
 
    /* set , map */
    public static void SetAndMap(){

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
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,100);
        map.remove(1);
        map.get(1);
    
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.remove(1);
        set.contains(1); // true or false
    }

    public static void String(){
        String str1 = "goodssssss";
        String[] strArr1=str1.split(" "); // 공백을 기준으로 분할
        str1.substring(0,5); // 이 구간만 자른다
        for(int i=0;i<str1.length();i++){
            System.out.println(str1.charAt(i)); // 한글자씩 분할하여 출력
        }

        String[] strArr2=str1.split(""); // str을 array로 변경

        str1 = str1.toUpperCase();
        str1 = str1.toLowerCase();

        // 한번 선언한 문자열은 변경이 불가하다 + 추가하고 싶다면 substring활용하여 새로운 변수로 선언
        String str2 = str1.substring(0,4) + "is" + str1.substring(4);

        System.out.println(str2); // 한글자씩 분할하여 출력


        
    }
}

//참고 : https://gwang920.github.io/java/Java-condingGrammer/
//https://velog.io/@ryusuz/JAVA-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8%EC%9A%A9-%EC%A3%BC%EC%9A%94-%ED%95%A8%EC%88%98-%EB%AA%A8%EC%9D%8C