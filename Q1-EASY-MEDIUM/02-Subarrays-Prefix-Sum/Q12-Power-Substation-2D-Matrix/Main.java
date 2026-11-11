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
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[][] grid = new int[r][c];
        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < c; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // TODO: Build 2D prefix sum array pref of size (r+1) x (c+1) in O(R x C)
        // pref[i+1][j+1] = grid[i][j] + pref[i][j+1] + pref[i+1][j] - pref[i][j]

        // TODO: Process Q queries in O(1) each:
        // sum = pref[r2+1][c2+1] - pref[r1][c2+1] - pref[r2+1][c1] + pref[r1][c1]

        for (int qi = 0; qi < q; qi++) {
            st = new StringTokenizer(br.readLine());
            int r1 = Integer.parseInt(st.nextToken());
            int c1 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());

            long querySum = 0;
            out.println(querySum);
        }

        out.flush();
    }
}

