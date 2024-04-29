package java_coding;
import java.util.*;
import java.io.*;

public class PRO_주차요금계산 {
    class Solution {
        public int[] solution(int[] fees, String[] records) {
            int[] answer = {};
            
            // step1 시간 측정
            HashMap<String,Integer> hm1 = new HashMap<>();
            HashMap<String,Integer> hm2 = new HashMap<>();
            
            for(int i=0;i<records.length;i++){
                int hours = Integer.parseInt(records[i].substring(0,2));
                int minutes = Integer.parseInt(records[i].substring(3,5));
                
                int total_time = 60*hours+minutes ;
                
                String car_num = records[i].substring(6,10);
                String state = records[i].substring(11);
                
                if(state.equals("IN")){
                    hm1.put(car_num , total_time);
                }
                else{
                    int cal_time = total_time - hm1.get(car_num);
                    
                    if(!hm2.containsKey(car_num)){
                        hm2.put(car_num,0);
                    }
                    
                    hm2.replace(car_num,cal_time+hm2.get(car_num));
                    hm1.replace(car_num,0);
                }
                
            }
            
            for(String key : hm1.keySet()){
                if(hm1.get(key)!=0){
                    int cal_time = 1439-hm1.get(key); // 남은 시간 계산
                    
                    if(!hm2.containsKey(key)){
                        hm2.put(key,0);
                    }
                    
                    hm2.replace(key,cal_time+hm2.get(key));
                    hm1.replace(key,0);
                }
                
                // step2 계산
                int answer_time = hm2.get(key);
                
                if( answer_time < fees[0] ) {
                    
                }
                
            }
            
            
            
            
            
            
            return answer;
        }
    }
}
