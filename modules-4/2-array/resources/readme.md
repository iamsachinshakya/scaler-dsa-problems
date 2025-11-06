# 📘 Detailed Revision Notes on Time Complexity and Space Complexity

## 🧠 Introduction to Complexity

In software engineering, understanding the efficiency of an algorithm involves assessing both **time complexity** and **space complexity**.  
These metrics help determine the **feasibility** of an algorithm in practice, especially with **large inputs**.

---

## 🗓️ Agenda

- **Big O Notation** – Describes the performance or complexity of an algorithm.
- **Time Complexity** – Number of operations relative to input size.
- **Space Complexity** – Working storage needed by the algorithm.
- **Importance of Constraints** – Defines operational limits.
- **Array Operations** – Basic operations and their complexity.

---

## 🔢 Big O Notation — Basics

**Big O** is a mathematical notation that describes how an algorithm’s running time or space requirements **grow** with input size.

### Key Concepts

- **Iteration Count (TC):** Number of times an operation executes.
- **Space Count (SC):** Memory used as a function of input size.
- **Ignoring Lower Order Terms & Constants:**
  - Lower order terms (e.g., `N` in `N² + 10N`) become negligible for large inputs.
  - Constant coefficients (e.g., `4` in `4N²`) are ignored since they don’t affect growth rate.

### Example

When `N = 10`, lower-order terms matter,  
but as `N` grows larger, their contribution becomes negligible.

---

## ⏱️ Time Complexity

Time complexity measures **how runtime increases** with input size.

### Steps to Determine Time Complexity

1. **Count the Iterations:** Determine how many times the main operation runs.
2. **Apply Big O:** Abstractly represent performance using dominant terms.
3. **Analyze Input Size:**
   - Typical safe limits for algorithms are around `10⁷` to `10⁸` operations per second to avoid **TLE (Time Limit Exceeded)**.

### Examples

- A loop running `N` times → **O(N)**
- Nested loops → **O(N²)**

---

## 💾 Space Complexity

Space complexity measures how much **memory** an algorithm uses relative to the input size.

### Steps to Determine Space Complexity

1. **Identify Storage Needs:** Count variables, arrays, or other data structures.
2. **Apply Big O:** Ignore constants and lower-order terms.

### Example

If an algorithm uses two fixed variables → **O(1)** space (constant space).

> **Note:** When calculating space complexity, ignore the input itself — consider only space created by the algorithm’s logic.

---

## ⚙️ Importance of Constraints

Constraints define the **limits** under which an algorithm must operate.

- **Real-world Limits:** Predict performance under maximum input size.
- **Performance Impact:** Helps design algorithms for **worst-case scenarios**, crucial in **competitive programming** or **system-critical applications**.

---

## 🧩 Arrays

Array operations are fundamental in algorithmic analysis.

| Operation        | Typical Complexity | Notes                                    |
| ---------------- | ------------------ | ---------------------------------------- |
| Reverse an Array | **O(N)**           | Each element is traversed once.          |
| Rotate by `K`    | **O(N⋅K)**         | Naive approach; optimized methods exist. |

### Example – Single Right Shift

Rotate array elements one position to the right.  
The **last element moves to the first position**.

---

## 🏁 Conclusion

Mastering **time** and **space complexity** helps engineers design **efficient, scalable, and reliable** software.  
Understanding constraints and optimizing algorithms for both runtime and memory are key to success in real-world development.

> 💡 **Tip:** Continuously practice applying these concepts to coding problems and explore optimization techniques to enhance your algorithmic skills.
