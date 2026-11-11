# Q005: Sensor Array Threshold Tuning

## Problem Statement
An environmental monitoring network deployed across a wildlife sanctuary consists of $N$ IoT sensor nodes. Each sensor node $i$ has accumulated a backlog of $A_i$ data packets awaiting satellite transmission.

A centralized gateway establishes a scheduled uplink communication window of at most $H$ hours. To conserve energy and prevent channel saturation, the gateway must configure an identical integer transmission speed $V$ (in packets per hour) across all $N$ sensor nodes.

When transmitting at speed $V$:
- Sensor $i$ transmits up to $V$ packets in each hour.
- If sensor $i$ has $A_i$ packets, it requires $\lceil A_i / V \rceil$ hours to clear its buffer.
- All sensors transmit sequentially through the scheduled channel. Thus, the total transmission time is the sum of hours taken by all $N$ sensors: $\sum_{i=1}^N \lceil A_i / V \rceil$.

The gateway must clear the entire backlog of all $N$ sensors within the $H$-hour budget.

Find the **minimum integer transmission speed $V$ ($V \ge 1$)** such that the total transmission time does not exceed $H$ hours. If it is impossible to complete within $H$ hours even with an arbitrarily large speed (for example, if $H < N$), print `-1`.

---

## Input Format
- The first line contains two space-separated integers, $N$ (number of sensors) and $H$ (maximum allowable total hours).
- The second line contains $N$ space-separated integers, $A_1, A_2, \dots, A_N$, denoting the number of data packets queued at each sensor.

## Output Format
- Print a single integer representing the minimum transmission rate $V$, or `-1` if impossible.

---

## Constraints
- $1 \le N \le 10^5$
- $1 \le H \le 10^9$
- $1 \le A_i \le 10^9$
- Notice: When $V$ is small, the accumulated total hours $\sum \lceil A_i / V \rceil$ can exceed $2^{31}-1$. You must use 64-bit integers (`long` in Java) when summing hours.

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
- Total hours = $\lceil 3/3 \rceil + \lceil 6/3 \rceil + \lceil 7/3 \rceil + \lceil 11/3 \rceil = 1 + 2 + 3 + 4 = 10 > 8$ hours (Exceeds $H$).
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

### Explanation
At speed $V = 23$:
- Hours: $\lceil 30/23 \rceil + \lceil 11/23 \rceil + \lceil 23/23 \rceil + \lceil 4/23 \rceil + \lceil 20/23 \rceil = 2 + 1 + 1 + 1 + 1 = 6 \le 6$.
At speed $V = 22$:
- Hours: $\lceil 30/22 \rceil + \lceil 11/22 \rceil + \lceil 23/22 \rceil + \dots = 2 + 1 + 2 + 1 + 1 = 7 > 6$.
Minimum speed is 23.

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
*(Explanation: Even if speed is infinite, each sensor requires at least 1 hour, so minimum total time is $2 > 1$)*

### Test Case 5 (Large values requiring 64-bit sum)
**Input:**
```text
3 1000000000
1000000000 1000000000 1000000000
```
**Output:**
```text
3
```
*(Explanation: At speed $V = 3$, each sensor takes $\lceil 10^9 / 3 \rceil = 333333334$ hours. Total hours = $1000000002 > 10^9$. At speed $V = 4$, $\dots$)*
Wait, let's trace: at $V = 3$, $3 \times 333333334 = 1000000002 > 10^9$.
At $V = 4$, $\lceil 10^9 / 4 \rceil = 250000000$. Total = $3 \times 250000000 = 750000000 \le 10^9$.
Let's make sure the example in Test Case 5 is clean.

### Test Case 5 (Updated: Exact Power of 10)
**Input:**
```text
1 1000
5000
```
**Output:**
```text
5
```
*(Explanation: $\lceil 5000 / 5 \rceil = 1000 \le 1000$)*

---

## Expected Time Complexity
$O(N \log(\max A_i))$ using Binary Search on the answer space.
A linear search for $V$ from 1 to $10^9$ will result in **Time Limit Exceeded (TLE)**.

## Difficulty Level
Medium

## Topic and Pattern
Binary Search on Answer / Monotonic Feasibility Check

