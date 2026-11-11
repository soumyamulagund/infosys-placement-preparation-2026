# Q13: Fleet Cargo Overload Check

## Problem Statement
An autonomous electric freight shuttle operates along a single linear rail corridor with stops indexed from $0$ to $10^5$. The shuttle has a fixed maximum payload capacity of $C$ units of weight.

The dispatch logistics system receives $N$ cargo transit reservations. The $i$-th reservation is defined by three integers:
$$[P_i, \text{From}_i, \text{To}_i]$$
This indicates that $P_i$ units of freight will be boarded onto the shuttle at stop $\text{From}_i$ and unloaded at stop $\text{To}_i$. 

Note: Because cargo is removed immediately upon arriving at $\text{To}_i$, it does not consume capacity between stop $\text{To}_i$ and subsequent stops.

Determine if the shuttle can successfully execute all $N$ delivery reservations without ever exceeding its maximum capacity $C$ at any point along the route. If it can, print `POSSIBLE`. If the capacity is exceeded at any point, print `OVERLOAD`.

---

## Input Format
- The first line contains two space-separated integers, $N$ (number of cargo trips) and $C$ (maximum vehicle capacity).
- The next $N$ lines each contain three space-separated integers: $P_i, \text{From}_i, \text{To}_i$.

## Output Format
- Print `POSSIBLE` if capacity is never breached, otherwise print `OVERLOAD`.

---

## Constraints
- $1 \le N \le 10^5$
- $1 \le C \le 10^9$
- $1 \le P_i \le 10^4$
- $0 \le \text{From}_i < \text{To}_i \le 10^5$

---

## Sample 1
### Sample Input
```text
2 4
2 1 5
3 3 7
```

### Sample Output
```text
OVERLOAD
```

### Explanation
- From stop 1 to 3: load is 2 $\le 4$.
- At stop 3: Reservation 2 boards 3 units of cargo $\to$ Total load becomes $2 + 3 = 5$ units.
- Since $5 > 4$, the shuttle exceeds its capacity at stop 3. Output `OVERLOAD`.

---

## Sample 2
### Sample Input
```text
2 5
2 1 5
3 3 7
```

### Sample Output
```text
POSSIBLE
```

### Explanation
Peak load is 5 at stop 3, which does not exceed $C = 5$. Output `POSSIBLE`.

---

## Expected Time Complexity
$O(N + M)$ where $M$ is the maximum stop index ($10^5$), using a Difference Array / Event Sweep.

## Difficulty Level
Easy–Medium

## Topic and Pattern
Difference Array / Interval Capacity Accumulation

