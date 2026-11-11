# Q3: Subgrid Power Transmission Optimization

## Problem Statement
A smart city electrical grid is structured as an $R \times C$ rectangular matrix of power substation cells. Each cell $(i, j)$ generates or consumes power, indicated by an integer rating $G_{i,j}$. A negative rating indicates a substation fault or deficit, while a non-negative rating indicates stable or surplus power generation.

The municipal engineers want to install a square solar canopy over a contiguous $K \times K$ subgrid of cells. However, to guarantee uninterrupted safety:
1. Every cell inside the chosen $K \times K$ square subgrid must be **healthy** ($G_{i,j} \ge 0$). If even a single cell inside the $K \times K$ region has $G_{i,j} < 0$, that entire square subgrid is invalid.
2. Among all valid $K \times K$ square subgrids, the engineers wish to choose the one that yields the **maximum total power sum**.

Given the matrix dimensions, the canopy dimension $K$, and the grid values, determine the maximum power sum obtainable from any valid $K \times K$ subgrid. If no valid $K \times K$ subgrid exists without faulty cells, print `-1`.

---

## Input Format
- The first line contains three space-separated integers: $R$ (rows), $C$ (columns), and $K$ (canopy square dimension).
- The next $R$ lines each contain $C$ space-separated integers, representing the grid values $G_{i,j}$.

## Output Format
- Print a single integer: the maximum total power sum of a valid $K \times K$ subgrid, or `-1` if no valid subgrid exists.

---

## Constraints
- $1 \le R, C \le 1000$
- $1 \le K \le \min(R, C)$
- $-10^4 \le G_{i,j} \le 10^4$
- The total grid size $R \times C \le 10^6$.
- Maximum possible sum fits in a standard 64-bit integer (`long`).

---

## Sample 1
### Sample Input
```text
3 4 2
1 2 3 4
5 6 -1 8
9 10 11 12
```

### Sample Output
```text
36
```

### Explanation
We consider all $2 \times 2$ subgrids:
- Top-left $[(0,0)$ to $(1,1)]$: values $\begin{pmatrix}1 & 2\\ 5 & 6\end{pmatrix}$, all cells $\ge 0$. Sum = $1 + 2 + 5 + 6 = 14$.
- Top-middle $[(0,1)$ to $(1,2)]$: contains cell $(1,2)$ which has value $-1 < 0$ $\to$ INVALID.
- Top-right $[(0,2)$ to $(1,3)]$: contains cell $(1,2)$ with value $-1 < 0$ $\to$ INVALID.
- Bottom-left $[(1,0)$ to $(2,1)]$: values $\begin{pmatrix}5 & 6\\ 9 & 10\end{pmatrix}$, all cells $\ge 0$. Sum = $5 + 6 + 9 + 10 = 30$.
- Bottom-middle $[(1,1)$ to $(2,2)]$: contains $-1$ $\to$ INVALID.
- Bottom-right $[(1,2)$ to $(2,3)]$: contains $-1$ $\to$ INVALID.
Wait, what about:
Top-left sum is 14.
Bottom-left sum is 30.
Wait! Let's check:
Row 0: 1 2 3 4
Row 1: 5 6 -1 8
Row 2: 9 10 11 12
Is there a $2 \times 2$ subgrid:
If we look at row 0, 1:
Col 0..1: sum = 1+2+5+6 = 14
Col 1..2: contains (1,2)=-1 (invalid)
Col 2..3: contains (1,2)=-1 (invalid)
If we look at row 1, 2:
Col 0..1: sum = 5+6+9+10 = 30
Col 1..2: contains -1 (invalid)
Col 2..3: contains -1 (invalid)
So max sum is 30!
Let's modify sample input to:
Row 0: 2 3 4 5
Row 1: 6 7 8 9
Row 2: 1 -1 10 11
Then Top-right:
Row 0..1, Col 2..3:
Row 0: 4, 5
Row 1: 8, 9
Sum = 4 + 5 + 8 + 9 = 26.
Top-left:
Row 0: 2, 3
Row 1: 6, 7
Sum = 2 + 3 + 6 + 7 = 18.
Top-middle:
Row 0: 3, 4
Row 1: 7, 8
Sum = 3 + 4 + 7 + 8 = 22.
Bottom-left contains -1 at (2,1).
Bottom-middle contains -1 at (2,1).
Bottom-right:
Row 1..2, Col 2..3:
Row 1: 8, 9
Row 2: 10, 11
Sum = 8 + 9 + 10 + 11 = 38! All positive!
Let's use this clean sample!
```

---

## Sample 1 (Updated)
### Sample Input
```text
3 4 2
2 3 4 5
6 7 8 9
1 -1 10 11
```

### Sample Output
```text
38
```

### Explanation
We evaluate valid $2 \times 2$ subgrids that contain no negative numbers:
- Cells $[(0,0)$ to $(1,1)]$: Sum = $2 + 3 + 6 + 7 = 18$ (Valid)
- Cells $[(0,1)$ to $(1,2)]$: Sum = $3 + 4 + 7 + 8 = 22$ (Valid)
- Cells $[(0,2)$ to $(1,3)]$: Sum = $4 + 5 + 8 + 9 = 26$ (Valid)
- Cells $[(1,0)$ to $(2,1)]$: Contains $-1$ at $(2, 1)$ $\to$ Invalid
- Cells $[(1,1)$ to $(2,2)]$: Contains $-1$ at $(2, 1)$ $\to$ Invalid
- Cells $[(1,2)$ to $(2,3)]$: Sum = $8 + 9 + 10 + 11 = 38$ (Valid, all elements $\ge 0$)

The maximum valid sum is 38.

---

## Sample 2
### Sample Input
```text
2 2 2
-1 5
3 4
```

### Sample Output
```text
-1
```

### Explanation
The only $2 \times 2$ subgrid contains a negative cell $(-1)$ at $(0,0)$. No valid subgrid exists, so output `-1`.

---

## Expected Time Complexity
$O(R \times C)$ using 2D Prefix Sums for both values and fault counts.

## Difficulty Level
Hard (High-End Specialist Programmer)

## Topic and Pattern
2D Prefix Sum Matrix / Subgrid Aggregation

