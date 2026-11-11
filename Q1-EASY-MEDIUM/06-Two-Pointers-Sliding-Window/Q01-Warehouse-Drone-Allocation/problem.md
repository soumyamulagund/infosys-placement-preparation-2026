# Q002: Warehouse Drone Cargo Allocation

## Problem Statement
An automated regional logistics hub dispatches parcels using a fleet of autonomous cargo drones.

Each drone has a maximum payload weight capacity $C$. Due to battery balance and compartment geometry, **each drone can carry at most 2 packages** at the same time, provided that the sum of the weights of the two packages does not exceed $C$. If a package cannot be paired, a drone can carry it alone.

You are given an integer $N$ representing the total number of packages, the drone payload capacity $C$, and an array $W$ of length $N$ indicating the weights of all individual packages.

Determine the **minimum number of drones** needed to transport all $N$ packages.

---

## Input Format
- The first line contains two space-separated integers, $N$ (number of packages) and $C$ (maximum capacity per drone).
- The second line contains $N$ space-separated integers, $W_1, W_2, \dots, W_N$, denoting the weight of each package.

## Output Format
- Print a single integer representing the minimum number of drones required.

---

## Constraints
- $1 \le N \le 10^5$
- $1 \le W_i \le C \le 10^9$
- It is guaranteed that every individual package weight $W_i$ is less than or equal to $C$.

---

## Sample 1
### Sample Input
```text
4 3
3 2 2 1
```

### Sample Output
```text
3
```

### Explanation
- Sorting the package weights gives $[1, 2, 2, 3]$.
- Drone 1 carries package of weight $3$ alone ($3 \le 3$).
- Drone 2 carries packages of weights $1$ and $2$ ($1 + 2 = 3 \le 3$).
- Drone 3 carries the remaining package of weight $2$ alone ($2 \le 3$).
Total drones required = 3.

---

## Sample 2
### Sample Input
```text
5 5
3 5 3 4 1
```

### Sample Output
```text
4
```

### Explanation
- Sorted weights: $[1, 3, 3, 4, 5]$.
- Drone 1 carries package $5$ alone.
- Drone 2 carries package $1$ and package $4$ ($1 + 4 = 5 \le 5$).
- Drone 3 carries package $3$ alone.
- Drone 4 carries package $3$ alone.
Total drones required = 4.

---

## Additional Test Cases

### Test Case 3 (All packages pairable)
**Input:**
```text
4 10
5 5 5 5
```
**Output:**
```text
2
```
*(Explanation: Two drones carrying pairs (5, 5) and (5, 5))*

### Test Case 4 (Single package)
**Input:**
```text
1 100
42
```
**Output:**
```text
1
```

### Test Case 5 (No pairs possible)
**Input:**
```text
3 10
6 7 8
```
**Output:**
```text
3
```
*(Explanation: Smallest pair sum is 6 + 7 = 13 > 10. Every package must travel individually)*

---

## Expected Time Complexity
$O(N \log N)$ for sorting + $O(N)$ two-pointer traversal $\implies O(N \log N)$.

## Difficulty Level
Easy

## Topic and Pattern
Two Pointers + Greedy / Sorting

