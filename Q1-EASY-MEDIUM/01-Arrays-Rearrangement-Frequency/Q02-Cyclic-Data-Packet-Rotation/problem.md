# Q02: Cyclic Data Packet Rotation

> **Assessment Metadata**
> - **Target Role:** DSE (Digital Specialist Engineer)
> - **Reported Period:** 2024 Candidate-reported Drive
> - **Verification Status:** Candidate-reported PYQ
> - **Difficulty Tier:** Easy
> - **Source Reference:** Infosys DSE Ring Buffer Cyclic Shift

---

## Problem Statement
An industrial circular sensor mesh records a sequential array of $N$ telemetry data values $A_1, A_2, \dots, A_N$. At regular sync intervals, the transmission hardware shifts all values cyclically to the right by $K$ positions.

When shifted right by $K$ positions:
- An element at index $i$ moves to $(i + K) \pmod N$.
- Values wrapped around the end reappear at the beginning.

Because memory is constrained on the microcontroller, you must rotate the array **in-place** using **$O(1)$ auxiliary memory** in **$O(N)$ time**. Creating a duplicate array of size $N$ will fail the memory constraint.

---

## Input Format
- The first line contains two space-separated integers, $N$ (number of telemetry readings) and $K$ (number of right shifts).
- The second line contains $N$ space-separated integers, $A_1, A_2, \dots, A_N$.

## Output Format
- Print $N$ space-separated integers representing the rotated array.

---

## Constraints
- $1 \le N \le 2 \times 10^5$
- $0 \le K \le 10^9$ (Note: $K$ can be much larger than $N$)
- $-10^9 \le A_i \le 10^9$
- Auxiliary Space: strictly $O(1)$.

---

## Sample 1
### Sample Input
```text
7 3
1 2 3 4 5 6 7
```

### Sample Output
```text
5 6 7 1 2 3 4
```

### Explanation
- Rotate 1 step right: $[7, 1, 2, 3, 4, 5, 6]$
- Rotate 2 steps right: $[6, 7, 1, 2, 3, 4, 5]$
- Rotate 3 steps right: $[5, 6, 7, 1, 2, 3, 4]$

---

## Sample 2
### Sample Input
```text
4 2
-1 -100 3 99
```

### Sample Output
```text
3 99 -1 -100
```

---

## Additional Test Cases

### Test Case 3 (K is a multiple of N)
**Input:**
```text
3 6
10 20 30
```
**Output:**
```text
10 20 30
```
*(Explanation: Rotating by $K = 6$ on $N = 3$ results in no change)*

### Test Case 4 (K = 0)
**Input:**
```text
2 0
5 9
```
**Output:**
```text
5 9
```

---

## Expected Time Complexity
$O(N)$ with $O(1)$ extra space using the 3-step reversal algorithm.

## Difficulty Level
Easy

---

## Edge Cases to Consider
- $K > N$ (must take $K = K \pmod N$)
- $K = 0$ or $K$ is a multiple of $N$
- Single element array ($N = 1$)
- Negative values in the array

