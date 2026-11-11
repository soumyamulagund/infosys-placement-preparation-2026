# Q09: Sensor Parity Balance

> **Assessment Metadata**
> - **Target Role:** DSE (Digital Specialist Engineer)
> - **Reported Period:** 2024 Candidate-reported
> - **Verification Status:** Candidate-reported PYQ
> - **Difficulty Tier:** Easy–Medium
> - **Source Reference:** Infosys Robotics Cleanroom Sensor Parity Problem

---

## Problem Statement
A semiconductor fabrication cleanroom operates $N$ sequential robotic sensors. Each sensor records an integer reading $S_i$. 

A diagnostic quality-control window is defined as a contiguous subarray of sensor readings that contains an **exact equal count of even numbers and odd numbers**.

Determine the **total number of contiguous parity-balanced subsegments** in the sensor reading log.

---

## Input Format
- The first line contains an integer $N$, denoting the number of sensor readings.
- The second line contains $N$ space-separated integers, $S_1, S_2, \dots, S_N$.

## Output Format
- Print a single 64-bit integer (`long`) representing the total number of parity-balanced contiguous subarrays.

---

## Constraints
- $1 \le N \le 2 \times 10^5$
- $-10^9 \le S_i \le 10^9$
- Count can reach up to $N(N+1)/2$, which requires `long` in Java.

---

## Sample 1
### Sample Input
```text
6
2 3 4 6 8 5
```

### Sample Output
```text
3
```

### Explanation
Mapping each reading to $+1$ if even, and $-1$ if odd gives: $[+1, -1, +1, +1, +1, -1]$.
The 3 contiguous parity-balanced subarrays (each with equal odd and even elements) are:
1. Indices $0$ to $1$: $[2, 3]$ (one even, one odd)
2. Indices $1$ to $2$: $[3, 4]$ (one odd, one even)
3. Indices $4$ to $5$: $[8, 5]$ (one even, one odd)
Total count = 3.

---

## Sample 2
### Sample Input
```text
4
1 2 1 2
```

### Sample Output
```text
4
```

### Explanation
Subarrays:
- $[1, 2]$ (indices 0..1)
- $[2, 1]$ (indices 1..2)
- $[1, 2]$ (indices 2..3)
- $[1, 2, 1, 2]$ (indices 0..3)
Total count = 4.

---

## Expected Time Complexity
$O(N)$ 

## Difficulty Level
Easyâ€“Medium

---

## Edge Cases to Consider
- All numbers even or all odd (output 0)
- Single pair of even and odd
- Maximum possible count N*(N+1)/2


