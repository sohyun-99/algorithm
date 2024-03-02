package java_coding.data_structure.binary_search;

import java.io.*;
import java.util.*;

public class BOJ_10816 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 카드의 개수
        TreeMap<Integer, Integer> cards = new TreeMap<>();

        // 카드에 적힌 숫자들을 TreeMap에 저장
        for (int i = 0; i < n; i++) {
            int card = scanner.nextInt();
            cards.put(card, cards.getOrDefault(card, 0) + 1);
        }

        int m = scanner.nextInt(); // 찾아야 할 숫자의 개수
        for (int i = 0; i < m; i++) {
            int target = scanner.nextInt();
            if (cards.containsKey(target))
                System.out.print(cards.get(target) + " "); // 해당 숫자가 존재하면 개수 출력
            else
                System.out.print("0 "); // 해당 숫자가 존재하지 않으면 0 출력
        }
    }
}
