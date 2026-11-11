# Q08: Smart Toll Maximum Gain

## Problem Statement
An automated highway express toll network monitors net revenue variation $R_1, R_2, \dots, R_N$ across $N$ hourly checkpoints. Each reading reflects earnings relative to fixed infrastructure costs:
- $R_i > 0$ represents net operational profit.
- $R_i < 0$ represents net maintenance deficit.

A transportation investment board wants to compute the **maximum revenue sum** achieved over any **non-empty contiguous window of hours**.

Notice: The window must contain at least one hour. If all hourly values are negative, the maximum sum is the value of the single least negative hour.

---

## Input Format
- The first line contains an integer $N$, denoting the number of hours recorded.
- The second line contains $N$ space-separated integers, $R_1, R_2, \dots, R_N$.

## Output Format
- Print a single 64-bit integer (`long`) representing the maximum contiguous subarray sum.

---

## Constraints
- $1 \le N \le 2 \times 10^5$
- $-10^9 \le R_i \le 10^9$
- The answer can be negative if all elements are negative. The answer can reach $2 \times 10^{14}$, so use `long` in Java.

---

## Sample 1
### Sample Input
```text
9
-2 1 -3 4 -1 2 1 -5 4
```

### Sample Output
```text
6
```

### Explanation
The contiguous subarray $[4, -1, 2, 1]$ achieves sum $4 + (-1) + 2 + 1 = 6$. No contiguous subarray yields a larger sum.

---

## Sample 2
### Sample Input
```text
3
-5 -2 -9
```

### Sample Output
```text
-2
```

### Explanation
Since all values are negative, the non-empty contiguous subarray with the largest sum is the single element $[-2]$.

---

## Expected Time Complexity
$O(N)$ with $O(1)$ space using Kadane's Algorithm.

## Difficulty Level
Easy

## Topic and Pattern
Prefix Running Sum / Maximum Subarray Sum (Kadane)

