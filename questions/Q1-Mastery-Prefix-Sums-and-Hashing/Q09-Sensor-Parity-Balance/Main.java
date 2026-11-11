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
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // TODO: Read input - Completed above

        // TODO: Process test cases if specified (Single testcase)

        // TODO: Implement the solution
        // Hint:
        // - Replace even numbers with +1, and odd numbers with -1.
        // - Problem transforms into: "Count number of subarrays with sum = 0".
        // - Use a HashMap<Integer, Long> to count occurrences of running prefix sum.

        long balancedCount = 0;

        // TODO: Print output
        System.out.println(balancedCount);
    }
}

