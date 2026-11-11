import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) {
            return;
        }

        StringTokenizer st = new StringTokenizer(line);
        int n = Integer.parseInt(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        long[] w = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            w[i] = Long.parseLong(st.nextToken());
        }

        // TODO: Read input - Completed above

        // TODO: Process test cases if specified (Single testcase here)

        // TODO: Implement the solution
        // Strategy hint:
        // - Can we greedily pair the heaviest available package with the lightest available package?
        // - Which data structure or traversal technique helps us pair extremes efficiently?

        int droneCount = 0;

        // TODO: Print output
        System.out.println(droneCount);
    }
}

