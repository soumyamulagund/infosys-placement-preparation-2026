# Q001: Subarray Energy Balance

## Problem Statement
A smart city renewable power station monitors hourly net energy flow. Every hour $i$, the station records an integer $E_i$ representing net energy exchange in megawatts:
- A positive value ($E_i > 0$) indicates surplus energy generated and supplied to the power grid.
- A negative value ($E_i < 0$) indicates an energy deficit drawn from the grid.
- Zero ($E_i = 0$) indicates balanced generation and consumption.

The system operator wants to identify the **longest continuous interval of hours** during which the total net energy exchanged was exactly $K$ megawatts.

If multiple such intervals exist, return the length of the longest one. If no such interval exists, return `0`.

---

## Input Format
- The first line contains an integer $T$, denoting the number of test cases.
- For each testcase:
  - The first line contains two space-separated integers, $N$ (the number of recorded hours) and $K$ (the target net energy sum).
  - The second line contains $N$ space-separated integers, $E_1, E_2, \dots, E_N$, denoting the energy recorded in each hour.

## Output Format
- For each test case, print a single integer representing the maximum length of a contiguous subarray whose sum equals $K$. If no such subarray exists, print `0`.

---

## Constraints
- $1 \le T \le 10$
- $1 \le N \le 2 \times 10^5$
- $-10^9 \le E_i \le 10^9$
- $-10^{14} \le K \le 10^{14}$
- The sum of $N$ over all test cases does not exceed $3 \times 10^5$.
- Notice: Cumulative energy sums can exceed $2^{31}-1$. You must use 64-bit integers (`long` in Java) for calculating and storing prefix sums.

---

## Sample 1
### Sample Input
```text
3
6 3
1 -1 5 -2 3 -3
3 5
2 3 5
4 10
1 2 3 1
```

### Sample Output
```text
6
2
0
```

### Explanation
- **Testcase 1:** $N = 6, K = 3$. The entire array $[1, -1, 5, -2, 3, -3]$ has a sum:
  $$1 + (-1) + 5 + (-2) + 3 + (-3) = 3$$
  The length of this interval is 6. While $[1, -1, 5, -2]$ also sums to 3 (length 4), the longest valid interval has length 6.
- **Testcase 2:** $N = 3, K = 5$. The subarray $[2, 3]$ (from index 0 to 1) has sum $2 + 3 = 5$ with length 2. The single element $[5]$ also sums to 5 with length 1. The maximum length is 2.
- **Testcase 3:** $N = 4, K = 10$. The total sum of all elements is $1 + 2 + 3 + 1 = 7$. No subarray achieves a sum of 10. Thus, the output is 0.

---

## Additional Test Cases

### Test Case 2
**Input:**
```text
1
6 -5
-5 8 -14 2 4 12
```
**Output:**
```text
5
```
*(Explanation: The subarray $[-5, 8, -14, 2, 4]$ from index 0 to 4 sums to $-5 + 8 - 14 + 2 + 4 = -5$, length = 5)*

### Test Case 3 (All Zeros with K = 0)
**Input:**
```text
1
5 0
0 0 0 0 0
```
**Output:**
```text
5
```
*(Explanation: Any subarray of zeros sums to 0. The longest is the entire array of length 5)*

### Test Case 4 (Single Element Match and Mismatch)
**Input:**
```text
2
1 7
7
1 5
-5
```
**Output:**
```text
1
0
```

---

## Expected Time Complexity
$O(N)$ per testcase using a Hash Map and Prefix Sums.
An $O(N^2)$ brute force will pass at most 40% of test cases and result in **Time Limit Exceeded (TLE)**.

## Difficulty Level
Easy–Medium

## Topic and Pattern
Prefix Sum + HashMap Lookups / Contiguous Subarrays

