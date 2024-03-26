package java_coding.graph;

import java.io.*;
import java.util.*;

public class BOJ_1387 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int p = Integer.parseInt(inputs[0]);
        int q = Integer.parseInt(inputs[1]);
        int k = Integer.parseInt(scanner.nextLine());

        int n = p * q;
        int limit = k;

        boolean isSafe = true;
        int i = 2;

        while (i <= limit) {
            if (n % i == 0 && gcd(p, i) == 1 && gcd(q, i) == 1) {
                isSafe = false;
                break;
            }
            i++;
        }

        if (isSafe)
            System.out.println("GOOD");
        else
            System.out.println("BAD " + i);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
