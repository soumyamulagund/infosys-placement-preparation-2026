# Notes: Q11 - Telemetry Remainder Cycle

## 1. Approach & Intuition
*(Why must we keep the earliest index instead of overwriting with the current index?)*

## 2. Complexity Analysis
- Time Complexity: O(N)
- Space Complexity: O(min(N, K))

## 3. Corner Cases Handled
- Subarray length must be $\ge 2$
- Array containing consecutive zeroes (e.g. `[0, 0]` with any K gives sum 0)

