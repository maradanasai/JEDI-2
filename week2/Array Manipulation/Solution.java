import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        long[] arr = new long[n];
        for (int i = 0; i < m; i++) {
            int lower = scanner.nextInt();
            int upper = scanner.nextInt();
            long sum = scanner.nextInt();

            arr[lower - 1] += sum;
            if (upper < n) {
                arr[upper] -= sum;
            }
        }

        long max = 0, temp = 0;
        for (int i = 0; i < n; i++) {
            temp += arr[i];
            if (temp > max) {
                max = temp;
            }
        }
        
        System.out.println(max);

        scanner.close();
    }
}
