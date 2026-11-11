# Q11: Telemetry Remainder Cycle

## Problem Statement
An aerospace telemetry receiver decodes a flight packet data stream consisting of $N$ non-negative integers $A_1, A_2, \dots, A_N$ and a synchronization modulus integer $K$.

A telemetry packet sequence is considered synchronized if there exists a **contiguous subarray of length at least 2** whose sum is an exact integer multiple of $K$ (i.e., $\sum_{m=i}^j A_m = c \times K$, for some integer $c \ge 0$).

Determine if such a synchronized subarray exists. Print `YES` if one exists, otherwise print `NO`.

---

## Input Format
- The first line contains two space-separated integers, $N$ (number of packets) and $K$ (synchronization modulus).
- The second line contains $N$ space-separated integers, $A_1, A_2, \dots, A_N$.

## Output Format
- Print `YES` if a contiguous subarray of size at least 2 with sum divisible by $K$ exists, otherwise print `NO`.

---

## Constraints
- $1 \le N \le 2 \times 10^5$
- $1 \le K \le 10^9$
- $0 \le A_i \le 10^9$
- Note: Subarray length must be **at least 2**. A single element divisible by $K$ does not qualify.

---

## Sample 1
### Sample Input
```text
5 6
23 2 4 6 7
```

### Sample Output
```text
YES
```

### Explanation
The subarray $[2, 4]$ has length 2 and sum $2 + 4 = 6$, which is a multiple of 6 ($1 \times 6$). Hence, `YES`.

---

## Sample 2
### Sample Input
```text
5 6
23 2 6 4 7
```

### Sample Output
```text
YES
```

### Explanation
The subarray $[23, 2, 6, 4, 7]$ has length 5 and sum $23 + 2 + 6 + 4 + 7 = 42 = 7 \times 6$, which is divisible by 6.

---

## Sample 3
### Sample Input
```text
3 13
23 2 8
```

### Sample Output
```text
NO
```

### Explanation
None of the contiguous subarrays of length $\ge 2$ ($[23, 2]$, $[2, 8]$, or $[23, 2, 8]$) have a sum divisible by 13.

---

## Expected Time Complexity
$O(N)$ using Prefix Sum Modulo with a Hash Map storing the earliest occurrence index of each remainder.

## Difficulty Level
Easy–Medium

## Topic and Pattern
Prefix Sum Modulo / Earliest Index Map with Length Constraint

