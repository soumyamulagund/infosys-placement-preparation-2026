# Q03: Balanced Server Telemetry

> **Assessment Metadata**
> - **Target Role:** Both (DSE / Specialist Programmer)
> - **Reported Period:** 2024 InfyTQ Coding Round
> - **Verification Status:** Candidate-reported PYQ
> - **Difficulty Tier:** Easy–Medium
> - **Source Reference:** Infosys Microservice Heartbeat Equilibrium Problem

---

## Problem Statement
A distributed microservices monitoring dashboard collects a chronological sequence of $N$ heartbeat events from cluster nodes. Each event is recorded as either:
- `1`: Representing a successful healthy request response.
- `0`: Representing a timeout or circuit breaker failure.

To diagnose intermittent load balancing oscillations, the site reliability engineering (SRE) team needs to determine the **maximum length of a contiguous sequence of heartbeat events** that contains an **equal number of healthy events (`1`) and failure events (`0`)**.

If no contiguous sequence contains equal 0s and 1s, print `0`.

---

## Input Format
- The first line contains an integer $N$, denoting the number of heartbeat events recorded.
- The second line contains $N$ space-separated integers, each either `0` or `1`.

## Output Format
- Print a single integer representing the maximum length of a contiguous subsegment containing an equal number of `0`s and `1`s.

---

## Constraints
- $1 \le N \le 2 \times 10^5$
- Every element in the input is either `0` or `1`.

---

## Sample 1
### Sample Input
```text
7
0 1 0 1 1 1 0
```

### Sample Output
```text
4
```

### Explanation
The subsegment from index 0 to 3: $[0, 1, 0, 1]$ contains two `0`s and two `1`s (length 4). Another balanced subsegment is $[1, 1, 1, 0]$ (wait, three 1s and one 0 is not balanced). No balanced subsegment has length greater than 4.

---

## Sample 2
### Sample Input
```text
6
0 1 1 0 1 0
```

### Sample Output
```text
6
```

### Explanation
The entire array of length 6 contains three `0`s and three `1`s. The maximum length is 6.

---

## Additional Test Cases

### Test Case 3 (All identical events)
**Input:**
```text
4
1 1 1 1
```
**Output:**
```text
0
```

### Test Case 4 (Single pair)
**Input:**
```text
2
1 0
```
**Output:**
```text
2
```

---

## Expected Time Complexity
$O(N)$ 

## Difficulty Level
Easyâ€“Medium

---

## Edge Cases to Consider
- All events are 0 or all are 1 (output 0)
- Whole array is balanced
- Single pair of [0, 1] or [1, 0]


