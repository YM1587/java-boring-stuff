#JAVA-BORING STUFF
To compile ,if you're having a problem ,use "> javac Fibonacci/Fibonacci.java
Then to run >> java Fibonacci.Fibonacci
"
fibonacii sequence is an example of a recursive algorithm and if you try to execute the code without initalization of the base case,the java with through a stack overflow exception because the method will recall itself infinitely.
for example you want the fibonacci series for a given number 5:
f(5=f(4)+f(3)
but we have to execute recursively for f(4) and f(3) ,then f(2) and finally the base case which is f(1).
for the given first code,when you input a larger value of n,then you'll have to wait for a little while for the compiler to compute.SO I'm going to recreate the code to optimize the algorithm for faster execution and efficency
So for the Fibonacci code,the program executed each fibonacci number but never kept it somewhere,so when it wanted to execute to the final fibonacci,it had to recalculate,making it super slow. for the second code,the algorithm implements memoization
where each calculated fibonacci number is stored for look up 
so another constraits is the long limit which is 9223372036854775807..so the highest fibonacci number in our program can 92 else it will start providing negative figures in the sequence 