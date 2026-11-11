# Q02: Zero-Loss Trading Window

> **Assessment Metadata**
> - **Target Role:** DSE (Digital Specialist Engineer)
> - **Reported Period:** 2023 On-Campus Assessment
> - **Verification Status:** Candidate-reported PYQ
> - **Difficulty Tier:** Easy
> - **Source Reference:** Infosys DSE Financial Ledger Zero-Sum Audit

---

## Problem Statement
An algorithmic quantitative hedge fund executes trades throughout a financial market session. The ledger records an array $T$ of $N$ sequential trades, where each value $T_i$ represents the profit or loss from the $i$-th transaction:
- $T_i > 0$ represents net profit from a winning trade.
- $T_i < 0$ represents net loss from an unprofitable trade.
- $T_i = 0$ represents a neutral/breakeven trade.

The risk committee requests a compliance report to count the **total number of contiguous trade execution windows** where the net aggregate profit/loss was **exactly zero** (i.e., $\sum_{k=i}^j T_k = 0$).

Note: If an individual trade has $T_i = 0$, that single trade is considered a contiguous subsegment of length 1 with sum 0.

---

## Input Format
- The first line contains an integer $N$, denoting the total number of trades.
- The second line contains $N$ space-separated integers, $T_1, T_2, \dots, T_N$.

## Output Format
- Print a single 64-bit integer (`long`) representing the total number of contiguous trade windows whose sum equals zero.

---

## Constraints
- $1 \le N \le 2 \times 10^5$
- $-10^9 \le T_i \le 10^9$
- Total count of valid subarrays can be up to $N(N+1)/2 \approx 2 \times 10^{10}$, which exceeds 32-bit `int`. Use `long` in Java.

---

## Sample 1
### Sample Input
```text
10
6 -1 -3 4 -2 2 4 6 -12 -7
```

### Sample Output
```text
4
```

### Explanation
The 4 contiguous trade sequences with zero net sum are:
1. Indices $1$ to $3$: $[-1, -3, 4] \to -1 - 3 + 4 = 0$
2. Indices $4$ to $5$: $[-2, 2] \to -2 + 2 = 0$
3. Indices $1$ to $5$: $[-1, -3, 4, -2, 2] \to 0$
4. Indices $5$ to $8$: $[2, 4, 6, -12] \to 2 + 4 + 6 - 12 = 0$

Total count = 4.

---

## Sample 2
### Sample Input
```text
4
0 0 0 0
```

### Sample Output
```text
10
```

### Explanation
All possible non-empty subarrays of length 1, 2, 3, and 4 sum to 0. Total = $4 + 3 + 2 + 1 = 10$.

---

## Additional Test Cases

### Test Case 3 (No zero-sum window)
**Input:**
```text
5
1 2 3 4 5
```
**Output:**
```text
0
```

### Test Case 4 (Alternating +1 and -1)
**Input:**
```text
4
1 -1 1 -1
```
**Output:**
```text
4
```
*(Subarrays: [1, -1], [-1, 1], [1, -1], and [1, -1, 1, -1])*

---

## Expected Time Complexity
$O(N)$ using Prefix Sum + Frequency Map (`HashMap<Long, Long>`).
$O(N^2)$ brute force will trigger **Time Limit Exceeded (TLE)** on $N = 2 \times 10^5$.

## Difficulty Level
Easy

---

## Edge Cases to Consider
- Entire array consists of zeroes (output is N*(N+1)/2)
- No zero-sum subarray exists (output 0)
- Large counts exceeding 32-bit int


