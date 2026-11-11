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

        StringTokenizer st = new StringTokenizer(line);
        int n = Integer.parseInt(st.nextToken());
        long kLong = Long.parseLong(st.nextToken());

        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        // TODO: Read input - Completed above

        // TODO: Process test cases if specified (Single testcase)

        // TODO: Implement the solution
        // Requirements:
        // - In-place rotation
        // - Handle K > N using modulo
        // - O(1) auxiliary space (no temp array)
        // - O(N) time complexity

        // TODO: Print output
        for (int i = 0; i < n; i++) {
            out.print(arr[i] + (i == n - 1 ? "" : " "));
        }
        out.println();
        out.flush();
    }
}

