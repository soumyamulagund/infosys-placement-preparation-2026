import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) {
            return;
        }

        int n = Integer.parseInt(line.trim());
        int[] arr = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n + 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // TODO: Read input - Completed above

        // TODO: Process test cases if specified (Single testcase)

        // TODO: Implement the solution
        // Requirements:
        // - Find the duplicate value in range [1, N]
        // - Do NOT modify the array
        // - O(1) auxiliary space
        // - O(N) time complexity
        // Hint: Treat the array as a linked list where arr[i] points to index arr[i].
        // Apply Floyd's Cycle Detection (Tortoise and Hare).

        int duplicate = -1;

        // TODO: Print output
        System.out.println(duplicate);
    }
}

