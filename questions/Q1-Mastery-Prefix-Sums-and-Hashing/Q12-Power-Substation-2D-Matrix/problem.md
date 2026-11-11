# Q12: Power Substation 2D Matrix

## Problem Statement
A metropolitan energy distribution grid is mapped onto an $R \times C$ 2D rectangular matrix of substation cells. Each cell $(i, j)$ (where $0 \le i < R$ and $0 \le j < C$) records an hourly net power rating $G_{i,j}$ in megawatts.

The regional dispatch operations center must process $Q$ high-frequency sub-region queries. Each query provides two coordinates representing the top-left cell $(r1, c1)$ and bottom-right cell $(r2, c2)$ of a rectangular operational zone.

For each query, calculate the **total net power sum** contained within the subgrid from $(r1, c1)$ to $(r2, c2)$ inclusive. Because there are up to $2 \times 10^5$ queries, each query must be answered in **$O(1)$ constant time**.

---

## Input Format
- The first line contains three space-separated integers: $R$ (rows), $C$ (columns), and $Q$ (number of queries).
- The next $R$ lines each contain $C$ space-separated integers, representing the grid values $G_{i,j}$.
- The next $Q$ lines each contain four space-separated integers: $r1, c1, r2, c2$.

## Output Format
- For each query, print the total subgrid sum on a new line.

---

## Constraints
- $1 \le R, C \le 1000$ ($R \times C \le 10^6$)
- $1 \le Q \le 2 \times 10^5$
- $0 \le r1 \le r2 < R$
- $0 \le c1 \le c2 < C$
- $-10^4 \le G_{i,j} \le 10^4$
- Must use 2D Prefix Sums to answer each query in $O(1)$. Loops per query will result in **Time Limit Exceeded (TLE)**.

---

## Sample 1
### Sample Input
```text
3 3 2
1 2 3
4 5 6
7 8 9
1 1 2 2
0 0 1 1
```

### Sample Output
```text
28
12
```

### Explanation
- Query 1: Top-left $(1, 1)$, bottom-right $(2, 2)$:
  $$\text{Cells: } \begin{pmatrix} 5 & 6 \\ 8 & 9 \end{pmatrix} \implies 5 + 6 + 8 + 9 = 28$$
- Query 2: Top-left $(0, 0)$, bottom-right $(1, 1)$:
  $$\text{Cells: } \begin{pmatrix} 1 & 2 \\ 4 & 5 \end{pmatrix} \implies 1 + 2 + 4 + 5 = 12$$

---

## Expected Time Complexity
- Preprocessing: $O(R \times C)$
- Query Time: $O(1)$ per query $\implies O(R \times C + Q)$ overall.

## Difficulty Level
Medium

## Topic and Pattern
2D Prefix Sums / Constant-Time Submatrix Range Queries

