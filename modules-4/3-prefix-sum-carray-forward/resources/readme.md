# 📘 Revision Notes for DSA: Arrays — Prefix Sum & Carry Forward

## 🧩 Introduction

In this session, we covered two key problem-solving techniques — **Prefix Sum** and **Carry Forward**, focusing on handling arrays efficiently.

---

## 🗂️ Agenda

- Introduction to Prefix Sum
- Modifying a given array
- Calculating the sum of even-indexed elements in a given range
- AG Pairs problem
- Introduction to Subarrays

---

## ⚙️ Techniques and Concepts

### 1. Prefix Sum

**Concept:**  
The _Prefix Sum_ technique transforms an array such that each position holds the sum of elements up to that position.  
It’s particularly useful for efficiently answering **range sum queries**.

**Example:**
Given an array `A = [2, 3, 1, 6, 4, 5]`, the prefix sum array `P` is:

P[0] = A[0]
P[1] = P[0] + A[1]
P[2] = P[1] + A[2]
...

✅ **Time Complexity:** `O(n)`  
✅ **Space Complexity:** `O(n)`

**Usage:**

- If `L = 0`, then `Sum[L, R] = P[R]`
- If `L ≠ 0`, then `Sum[L, R] = P[R] - P[L - 1]`

---

### 2. Optimized Prefix Sum for Even Indexed Elements

**Approach:**
Construct a prefix sum array considering only even-indexed elements.

If i is even → PSe[i] = PSe[i - 1] + A[i]
If i is odd → PSe[i] = PSe[i - 1]

**Example:**
For `A = [2, 3, 1, 6, 4, 5]`,  
the prefix sum for even indices is:

PSe = [2, 2, 3, 3, 7, 7]

✅ **Time Complexity:** `O(n)`  
✅ **Space Complexity:** `O(n)`

**Optimized Code:**

```cpp
void sumOfEvenIndexed(int Array[], int N) {
    int PSe[N];
    PSe[0] = Array[0];
    for (int i = 1; i < N; i++) {
        if (i % 2 == 0)
            PSe[i] = PSe[i - 1] + Array[i];
        else
            PSe[i] = PSe[i - 1];
    }
}
```

Query Answering:
Use the same prefix sum subtraction logic for range queries.

3. Carry Forward Technique

Concept:
This technique helps reduce redundant calculations by carrying forward intermediate results.
It’s efficient in problems where recalculating from scratch would be costly.

Example (AG Pairs Problem):
Find pairs where s[i] = 'a' and s[j] = 'g' with i < j.

Optimized Solution:

int countAGPairs(string s) {
int countG = 0, result = 0;
for (int i = s.length() - 1; i >= 0; --i) {
if (s[i] == 'g') countG++;
if (s[i] == 'a') result += countG;
}
return result;
}

Explanation:
Start from the end of the string, count the number of 'g' characters encountered,
and whenever an 'a' is found, add the count of 'g's to the result.

4. Subarrays

Concept:
A subarray is a contiguous portion of an array.
It can range from a single element to the entire array.

A subarray maintains order and contiguity.

Unlike a set, elements must be consecutive.

🧠 Summary

This session emphasized the importance of efficient array manipulation techniques such as:

Prefix Sum: for fast range sum queries.

Carry Forward: for optimized iterative computation.

By mastering these, you can tackle a wide range of Data Structures & Algorithms (DSA) problems efficiently — both in terms of time and space complexity.

---
