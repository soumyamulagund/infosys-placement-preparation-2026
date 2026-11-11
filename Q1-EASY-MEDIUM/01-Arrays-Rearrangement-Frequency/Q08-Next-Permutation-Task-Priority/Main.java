import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
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
        // Algorithm:
        // 1. Find pivot: largest index i such that arr[i] < arr[i + 1] (from right).
        // 2. If no such i exists, reverse the entire array and finish.
        // 3. If i exists, find successor: largest index j > i such that arr[j] > arr[i].
        // 4. Swap arr[i] and arr[j].
        // 5. Reverse subsegment from i + 1 to n - 1.

        // TODO: Print output
        for (int i = 0; i < n; i++) {
            out.print(arr[i] + (i == n - 1 ? "" : " "));
        }
        out.println();
        out.flush();
    }
}

