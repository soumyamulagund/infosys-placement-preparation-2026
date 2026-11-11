# Notes: Q07 - Satellite Bandwidth Difference Array

## 1. Approach & Intuition
*(Why does diff[l] += v and diff[r+1] -= v perform range updates in O(1)?)*

## 2. Complexity Analysis
- Time Complexity: O(N + Q)
- Space Complexity: O(N)

## 3. Corner Cases Handled
- Range spans entire array (1 to N)
- Negative delta values (V < 0)
- Fast I/O with PrintWriter when N = 200,000

