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
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int[][] grid = new int[r][c];
        for (int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < c; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        // TODO: Build 2D prefix sum array for grid power values (use long to prevent overflow)
        
        // TODO: Build 2D prefix sum array for faulty cells (cell = 1 if G[i][j] < 0 else 0)
        
        // TODO: Iterate over all possible top-left corners of K x K squares
        // Check in O(1) if fault count is 0 using prefix sum
        // If fault count == 0, query subgrid power sum in O(1) and update max
        
        // TODO: Print the maximum valid sum or -1 if no valid square exists
    }
}

