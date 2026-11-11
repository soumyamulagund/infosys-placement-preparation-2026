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

        // TODO: Process test cases if specified (Single test case)

        // TODO: Implement the solution
        // Strategy hint:
        // - Transforming 0 into -1 turns the problem into: "Longest subarray with sum = 0".
        // - Track running prefix sum.
        // - Store the earliest index where each sum appears in a HashMap.

        int maxLen = 0;

        // TODO: Print output
        System.out.println(maxLen);
    }
}

