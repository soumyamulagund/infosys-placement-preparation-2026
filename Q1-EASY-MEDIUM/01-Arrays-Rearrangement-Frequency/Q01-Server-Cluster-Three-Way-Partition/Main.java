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
        // Requirements:
        // - In-place rearrangement of 0s, 1s, and 2s
        // - Single pass O(N) time
        // - O(1) auxiliary space (no frequency arrays or built-in sort)

        // TODO: Print output
        for (int i = 0; i < n; i++) {
            out.print(arr[i] + (i == n - 1 ? "" : " "));
        }
        out.println();
        out.flush();
    }
}

