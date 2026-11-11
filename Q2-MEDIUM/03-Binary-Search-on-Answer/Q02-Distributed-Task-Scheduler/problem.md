# Q2: Distributed Cluster Task Scheduler

## Problem Statement
You are managing an enterprise distributed computing cluster with $K$ identical worker nodes. The system receives a queue of $N$ sequential batch tasks. The $i$-th task requires $T_i$ seconds of execution time.

To preserve data pipeline order and avoid network cache invalidation, each worker node must be assigned a **contiguous subsegment** of tasks from the queue. Every task must be assigned to exactly one worker node, and no worker node can be left with zero tasks unless $K > N$.

The total workload of a worker node is the sum of execution times of all tasks assigned to it.

Your objective is to schedule the tasks such that the **maximum workload assigned to any single worker node is minimized**.

---

## Input Format
- The first line contains two space-separated integers, $N$ (number of tasks) and $K$ (number of worker nodes).
- The second line contains $N$ space-separated integers, $T_1, T_2, \dots, T_N$, denoting the execution time of each task.

## Output Format
- Print a single integer representing the minimum possible value of the maximum workload assigned to any worker node.

---

## Constraints
- $1 \le K \le N \le 10^5$
- $1 \le T_i \le 10^9$
- Total execution time can reach $10^{14}$; use 64-bit integers (`long`) in Java.

---

## Sample 1
### Sample Input
```text
5 3
7 2 5 10 8
```

### Sample Output
```text
14
```

### Explanation
An optimal partition into $K = 3$ contiguous blocks is:
- Worker 1: $[7, 2, 5] \to \text{Workload} = 14$
- Worker 2: $[10] \to \text{Workload} = 10$
- Worker 3: $[8] \to \text{Workload} = 8$

The maximum workload among all workers is $\max(14, 10, 8) = 14$. No assignment can achieve a maximum workload smaller than 14.

---

## Sample 2
### Sample Input
```text
4 2
1 2 3 4
```

### Sample Output
```text
6
```

### Explanation
We can partition as:
- Worker 1: $[1, 2, 3] \to \text{Workload} = 6$
- Worker 2: $[4] \to \text{Workload} = 4$

Maximum workload is $\max(6, 4) = 6$.

---

## Additional Test Cases
### Test Case 3
**Input:**
```text
5 5
10 20 30 40 50
```
**Output:**
```text
50
```
*(Explanation: Each worker gets exactly 1 task. Maximum is 50)*

### Test Case 4
**Input:**
```text
6 1
5 10 15 20 25 30
```
**Output:**
```text
105
```
*(Explanation: Single worker must execute all tasks. Sum = 105)*

---

## Expected Time Complexity
$O(N \log(\sum T_i))$

## Difficulty Level
Medium

## Topic and Pattern
Binary Search on Answer / Monotonic Predicate with Greedy Feasibility Check

