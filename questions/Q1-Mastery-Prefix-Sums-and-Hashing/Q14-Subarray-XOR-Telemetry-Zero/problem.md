# Q14: Subarray XOR Telemetry Zero

## Problem Statement
An embedded hardware cryptography controller transmits a telemetry stream of $N$ sensor words represented as non-negative integers $A_1, A_2, \dots, A_N$.

Due to parity cancellation, a framing error occurs whenever a contiguous sequence of transmitted words has a cumulative bitwise XOR sum equal to **zero**:
$$\bigoplus_{k=i}^j A_k = A_i \oplus A_{i+1} \oplus \dots \oplus A_j = 0$$

Find the **total number of contiguous subarrays** whose bitwise XOR sum is exactly zero.

---

## Input Format
- The first line contains an integer $N$, denoting the number of words.
- The second line contains $N$ space-separated integers, $A_1, A_2, \dots, A_N$.

## Output Format
- Print a single 64-bit integer (`long`) representing the total count of contiguous subarrays with an XOR sum of zero.

---

## Constraints
- $1 \le N \le 2 \times 10^5$
- $0 \le A_i \le 10^9$
- Total count can reach $N(N+1)/2$, so use `long`.

---

## Sample 1
### Sample Input
```text
5
4 2 2 6 4
```

### Sample Output
```text
2
```

### Explanation
The 2 contiguous subarrays with XOR sum equal to 0 are:
1. Indices $1$ to $2$: $[2, 2] \to 2 \oplus 2 = 0$
2. Indices $2$ to $4$: $[2, 6, 4] \to 2 \oplus 6 \oplus 4 = 0$ (In binary: $010_2 \oplus 110_2 \oplus 100_2 = 000_2$)

Total count = 2.

---

## Sample 2
### Sample Input
```text
3
0 0 0
```

### Sample Output
```text
6
```

### Explanation
Every possible non-empty subarray has XOR sum 0 ($3 \times 4 / 2 = 6$).

---

## Expected Time Complexity
$O(N)$ using Prefix XOR + Frequency Map (`HashMap<Integer, Long>`).

## Difficulty Level
Easy–Medium

## Topic and Pattern
Prefix XOR + Frequency Map / Bitwise Cancellation

