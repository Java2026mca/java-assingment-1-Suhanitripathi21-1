import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.isEmpty()) return;

        int n = Integer.parseInt(line.trim());

        if (n <= 0) return;

        long first = 0;
        long second = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(first);
            
            // Calculate next term
            long next = first + second;
            first = second;
            second = next;

            // Print space only if it's not the last element
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        // Optional: ensure a clean exit with a newline
        System.out.println();
    }
}
