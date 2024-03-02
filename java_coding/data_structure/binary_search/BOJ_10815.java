package java_coding.data_structure.binary_search;

import java.io.*;
import java.util.*;

public class BOJ_10815 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        HashMap<Integer, Integer> cards = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int card = scanner.nextInt();
            cards.put(card, cards.getOrDefault(card, 0) + 1);
        }

        int m = scanner.nextInt(); 
        for (int i = 0; i < m; i++) {
            int target = scanner.nextInt();
            if (cards.containsKey(target))
                System.out.print(cards.get(target) + " "); 
            else
                System.out.print("0 "); 
        }
    }
}