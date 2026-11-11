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
        int q = Integer.parseInt(st.nextToken());

        // TODO: Read input - queries
        // Use a difference array of size (n + 2) to handle 1-based indexing:
        // long[] diff = new long[n + 2];
        // For each query (l, r, v):
        //   diff[l] += v;
        //   diff[r + 1] -= v;

        // TODO: Compute prefix sum to reconstruct final array in O(N)

        // TODO: Print output using PrintWriter for fast I/O
        out.flush();
    }
}

