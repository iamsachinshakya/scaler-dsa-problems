# Comprehensive Revision Notes for Introduction to Problem Solving and Time Complexity

## Introduction

This class serves as the introductory session for the Intermediate Data Structures and Algorithms (DSA) module. The objective is to lay the foundation for efficient problem solving by introducing concepts such as factors, the basics of time complexity, and helping learners transition from brute-force solutions to optimized ones【6:0†source】.

## Factors and Problem Solving

### Understanding Factors

- **Definition**: A factor of a number $ N $ is an integer that divides $ N $ completely without leaving a remainder.
- **Example**: For the number 18, its factors are 1, 2, 3, 6, 9, and 18【6:3†source】.

### Quiz Example

- **Question**: Number of factors for the number 24?
- **Answer**: The factors are 1, 2, 3, 4, 6, 8, 12, and 24, leading to a total of 8 factors .

## Introduction to Time Complexity

### What is Time Complexity?

Time complexity is a measure of the amount of time an algorithm takes to complete as a function of the length of the input.

### Steps to Calculate Time Complexity

1. **Identify the Iteration Count**: Determine how often a loop or operation is executed.
2. **Ignore Lower Order Terms**: Focus only on the term with the highest rate of growth.
3. **Ignore Constant Coefficients**: Big O notation represents an upper bound, focusing on the variable part of the formula【6:7†source】【6:2†source】.

### Big O Notation

- **Definition**: It is used to classify algorithms according to their running time or space requirements in the worst-case.
- **Common Complexity Classes**:
  - $ O(1) $: Constant time
  - $ O(\log n) $: Logarithmic time
  - $ O(n) $: Linear time
  - $ O(n \log n) $: Linearithmic time
  - $ O(n^2) $: Quadratic time【6:7†source】.

### Example - Big O Calculation

- Consider a logic where you need to find a pattern for Big O:
  - **Expression**: $ 4n + 3n \log n + 1 $
  - **Solution**: Ignore lower order terms (remove $ n $) and ignore constants. Resulting complexity is $ O(n \log n) $【6:10†source】.

## Problem Solving Strategy

1. **Brute Force Approach**: Initially solve problems using straightforward methods.
2. **Transition to Optimized Approach**: Reduce complexity through techniques like reducing iteration count.
   - For example, a brute force factor calculation has $ O(n) $ complexity, while an optimized version has $ O(\sqrt{n}) $ complexity due to fewer iterations【6:13†source】.

## Conclusion

In this introductory class, the focus was on grasping basic concepts of factors and time complexity which are foundational for mastering advanced data structures and algorithm strategies. The next sessions will delve deeper into these topics, ensuring a robust understanding and ability to implement efficient solutions in competitive programming contexts【6:11†source】【6:14†source】.
