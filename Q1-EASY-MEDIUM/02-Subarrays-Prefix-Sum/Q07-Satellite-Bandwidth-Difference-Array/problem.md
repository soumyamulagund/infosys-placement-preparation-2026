# Q07: Satellite Bandwidth Difference Array

> **Assessment Metadata**
> - **Target Role:** Both (DSE / Specialist Programmer)
> - **Reported Period:** 2025 Placement Drive
> - **Verification Status:** Candidate-reported PYQ
> - **Difficulty Tier:** Easy–Medium
> - **Source Reference:** Infosys LEO Satellite Constellation Beam Steering

---

## Problem Statement
A low-Earth orbit (LEO) satellite communications constellation consists of $N$ satellites positioned in a single orbital plane, numbered $1$ through $N$. Initially, each satellite is configured with a baseline allocated payload bandwidth of $0$ Mbps.

Over an orbital pass, the ground station issues $Q$ beam-steering bandwidth allocation commands. Each command is specified by three integers: $L, R,$ and $V$. This instructs the constellation to increase the operational bandwidth of **every satellite from satellite $L$ to satellite $R$ (inclusive)** by $V$ Mbps.

Your task is to compute and print the final bandwidth allocated to each of the $N$ satellites after all $Q$ commands have been applied.

---

## Input Format
- The first line contains two space-separated integers, $N$ (number of satellites) and $Q$ (number of bandwidth allocation commands).
- The next $Q$ lines each contain three space-separated integers: $L_i, R_i,$ and $V_i$.

## Output Format
- Print $N$ space-separated integers representing the final bandwidth allocated to satellites $1, 2, \dots, N$.

---

## Constraints
- $1 \le N \le 2 \times 10^5$
- $1 \le Q \le 2 \times 10^5$
- $1 \le L_i \le R_i \le N$
- $-10^6 \le V_i \le 10^6$
- **Notice on Complexity:** If you update each satellite from $L$ to $R$ using a loop for every query, the total operations will be up to $N \times Q \approx 4 \times 10^{10}$, causing a severe **Time Limit Exceeded (TLE)**. You must use the **Difference Array (Prefix Reconstruction)** technique to achieve $O(N + Q)$ time.

---

## Sample 1
### Sample Input
```text
5 3
1 2 100
2 5 100
3 4 100
```

### Sample Output
```text
100 200 200 200 100
```

### Explanation
- Initial bandwidths: $[0, 0, 0, 0, 0]$
- Command 1: Add 100 to range $[1, 2] \to [100, 100, 0, 0, 0]$
- Command 2: Add 100 to range $[2, 5] \to [100, 200, 100, 100, 100]$
- Command 3: Add 100 to range $[3, 4] \to [100, 200, 200, 200, 100]$
Final state: `100 200 200 200 100`.

---

## Sample 2
### Sample Input
```text
4 2
1 4 50
2 3 -20
```

### Sample Output
```text
50 30 30 50
```

---

## Expected Time Complexity
$O(N + Q)$ 

## Difficulty Level
Easyâ€“Medium

---

## Edge Cases to Consider
- Range updates spanning all N satellites
- Negative bandwidth adjustments (V < 0)
- Q = 200,000 queries requiring O(N+Q)


