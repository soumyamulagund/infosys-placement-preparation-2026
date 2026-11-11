# Q01: Sensor Array Threshold Tuning

> **Assessment Metadata**
> - **Target Role:** Specialist Programmer (SP Tier)
> - **Reported Period:** 2024 Specialist Programmer Assessment
> - **Verification Status:** Candidate-reported PYQ
> - **Difficulty Tier:** Medium
> - **Source Reference:** Infosys SP Sensor Uplink Satellite Optimization

---

## Problem Statement
An environmental monitoring network deployed across a wildlife sanctuary consists of $N$ IoT sensor nodes. Each sensor node $i$ has accumulated a backlog of $A_i$ data packets awaiting satellite transmission.

A centralized gateway establishes a scheduled uplink communication window of at most $H$ hours. To conserve energy and prevent channel saturation, the gateway must configure an identical integer transmission speed $V$ (in packets per hour) across all $N$ sensor nodes.

When transmitting at speed $V$:
- Sensor $i$ transmits up to $V$ packets in each hour.
- If sensor $i$ has $A_i$ packets, it requires $\lceil A_i / V \rceil$ hours to clear its buffer.
- All sensors transmit through the scheduled channel. Thus, the total transmission time is the sum of hours taken by all $N$ sensors:
  $$\sum_{i=1}^N \left\lceil \frac{A_i}{V} \right\rceil$$

The gateway must clear the entire backlog of all $N$ sensors within the $H$-hour budget.

Find the **minimum integer transmission speed $V$ ($V \ge 1$)** such that the total transmission time does not exceed $H$ hours. If it is impossible to complete within $H$ hours even with an arbitrarily large speed (for example, if $H < N$), print `-1`.

---

## Input Format
- The first line contains two space-separated integers, $N$ (number of sensors) and $H$ (maximum allowable total hours).
- The second line contains $N$ space-separated integers, $A_1, A_2, \dots, A_N$, denoting the number of data packets queued at each sensor.

## Output Format
- Print a single integer representing the minimum transmission rate $V$, or `-1` if impossible.

---

## Constraints & Partial Scoring Breakdown

| Subtask | Score Weight | Constraints | Feasible Approach | Notes |
|---|:---:|---|---|---|
| **Subtask 1** | **40% – 50%** | $N \le 1000$, $\max(A_i) \le 10^4$, $H \le 10^6$ | Linear Search ($V = 1, 2, 3, \dots$) | Feasible within 2.0s limit for small values. Gives crucial SP partial marks. |
| **Subtask 2** | **Full (100%)** | $N \le 10^5$, $\max(A_i) \le 10^9$, $H \le 10^9$ | Binary Search on Answer Space | Linear search times out ($10^9$ operations $\implies$ TLE). $O(N \log(\max A))$ passes in 0.2s. |

### Note on Integer Overflow:
When $V$ is small, the accumulated sum $\sum \lceil A_i / V \rceil$ can exceed $2^{31}-1$. You must use 64-bit integers (`long` in Java) when calculating total hours.

---

## Sample 1
### Sample Input
```text
4 8
3 6 7 11
```

### Sample Output
```text
4
```

### Explanation
Testing transmission speed $V = 4$:
- Sensor 1 ($3$ packets): $\lceil 3 / 4 \rceil = 1$ hour.
- Sensor 2 ($6$ packets): $\lceil 6 / 4 \rceil = 2$ hours.
- Sensor 3 ($7$ packets): $\lceil 7 / 4 \rceil = 2$ hours.
- Sensor 4 ($11$ packets): $\lceil 11 / 4 \rceil = 3$ hours.
- Total hours required: $1 + 2 + 2 + 3 = 8$ hours, which is $\le 8$ hours.

If speed $V = 3$:
- Total hours = $1 + 2 + 3 + 4 = 10 > 8$ hours (Exceeds $H$).
Therefore, the minimum required speed is 4.

---

## Sample 2
### Sample Input
```text
5 5
30 11 23 4 20
```

### Sample Output
```text
30
```

### Explanation
Since $H = N = 5$, every sensor must complete transmission in at most 1 hour. Hence, the speed $V$ must be at least $\max(A) = 30$.

---

## Sample 3
### Sample Input
```text
5 6
30 11 23 4 20
```

### Sample Output
```text
23
```

---

## Additional Test Cases

### Test Case 4 (Impossible: H < N)
**Input:**
```text
2 1
10 20
```
**Output:**
```text
-1
```
*(Explanation: Even with infinite speed, each sensor takes at least 1 hour, so minimum total time is $2 > 1$)*

### Test Case 5 (Single Large Value)
**Input:**
```text
1 1000
5000
```
**Output:**
```text
5
```

---

## Edge Cases to Consider
- $H < N$ (impossible case: immediately return `-1`)
- $H = N$ (speed $V$ must equal $\max(A)$)
- Integer ceiling formula: `(A[i] + V - 1) / V`
- Accumulator for hours must be `long` to prevent overflow
