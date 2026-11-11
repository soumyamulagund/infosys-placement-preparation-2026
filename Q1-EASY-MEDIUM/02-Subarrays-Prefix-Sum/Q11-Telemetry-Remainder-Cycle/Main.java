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
        long k = Long.parseLong(st.nextToken());

        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        // TODO: Read input - Completed above

        // TODO: Process test cases if specified (Single testcase)

        // TODO: Implement the solution
        // Hint:
        // - Store earliest index of each remainder in Map<Long, Integer>.
        // - Map starts with {0L: -1}.
        // - If remainder has been seen at index prev and (i - prev >= 2), we found a valid subarray!
        // - If remainder not seen, put (rem, i). (Do not overwrite with later index to keep length maximized!)

        boolean found = false;

        // TODO: Print output
        System.out.println(found ? "YES" : "NO");
    }
}

