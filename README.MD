<h2>Java - Fibonacci Recursion and Optimization</h2>
How to Compile and Run
If you're having trouble compiling the program, try the following commands:
```bash
Bash 
javac Fibonacci/Fibonacci.java
java Fibonacci.Fibonacci
```
About the Fibonacci Sequence
The Fibonacci sequence is a classic example of a recursive algorithm. Each number in the sequence is the sum of the two preceding ones:
```bash
f(n) = f(n - 1) + f(n - 2)
```
To compute f(5) for example, the program will recursively evaluate:
```bash
f(5) = f(4) + f(3)
f(4) = f(3) + f(2)
...
```
This continues until it reaches the base cases, typically:
```bash
f(1) = 1
f(0) = 0
```
⚠️ Important: If the base cases are not defined, the recursion will never stop and will eventually cause a StackOverflowError.

Performance Considerations
The initial version of the code calculates each Fibonacci number by recomputing all previous values repeatedly. This leads to poor performance, especially for larger input values, as the number of recursive calls grows exponentially.

To improve this, the optimized version of the code uses memoization. This means it stores previously calculated Fibonacci numbers in memory, significantly reducing redundant computations and speeding up execution.

Limitations
Because the program uses Java's long data type to store Fibonacci numbers, the maximum value it can hold is:
```bash
9,223,372,036,854,775,807 (Long.MAX_VALUE)
```
The largest Fibonacci number that can safely fit in a long is f(92). Beyond that, the values will overflow and become negative due to data type limitations.
