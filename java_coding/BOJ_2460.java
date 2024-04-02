package java_coding;

import java.io.*;
import java.util.*;

// 지능형 기차2
public class BOJ_2460 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxPassengers = 0; // 기차에 타고 있는 최대 승객 수
        int currentPassengers = 0; // 현재 기차에 타고 있는 승객 수

        // 10번의 역을 거치므로, 10번 반복
        for (int i = 0; i < 10; i++) {
            int off = scanner.nextInt(); // 내린 승객 수
            int on = scanner.nextInt(); // 탄 승객 수

            // 현재 승객 수 갱신
            currentPassengers -= off;
            currentPassengers += on;

            // 최대 승객 수 갱신
            maxPassengers = Math.max(maxPassengers, currentPassengers);
        }

        System.out.println(maxPassengers); // 최대 승객 수 출력
    }
}