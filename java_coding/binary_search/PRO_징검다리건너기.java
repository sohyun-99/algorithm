package java_coding.binary_search;
import java.util.*;
import java.io.*;

public class PRO_징검다리건너기 {
    public int solution(int[] stones, int k) {
        int answer = 0;
        int n = 0 ;
        int start = 0;
        int end = findMax(stones);        
        
        int[] stonesCopy = Arrays.copyOf(stones , stones.length);
        
        while(start<=end){
            
            int count = 0 ;
            int c = 0 ;
            
            int mid = (start+end)/2;
            System.out.println(mid);
            for(int i=0;i<stones.length;i++){
                stonesCopy[i]= stones[i] - mid;        
                
                if(stonesCopy[i]<0) {
                    count++;
                }else{
                    c = Math.max(count,c);
                    count=0;
                }
                
            }            
            
            c= Math.max(count, c); 
            
            if(c>=k){
                end=mid-1;
            }
            else if(c<k){
                answer = Math.max(answer , mid);
                start = mid +1;
            }
        }
        
        return answer;
    }
    
    
    
    static int findMax(int[] stones){
        int max=0;
        for(int i=0;i<stones.length;i++){
            if(max<=stones[i]) {
                max = stones[i];
            }
        }
        return max;
    }
}
