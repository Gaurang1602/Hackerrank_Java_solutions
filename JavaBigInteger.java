Question-
  
  
In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

Input Format

There will be two lines containing two numbers,  and .

Constraints

 and  are non-negative integers and can have maximum  digits.

Output Format

Output two lines. The first line should contain , and the second line should contain . Don't print any leading zeros.

Sample Input

1234
20
Sample Output

1254
24680
Explanation



Solution-



import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
10
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
11
    
12
          Scanner sc = new Scanner(System.in);
13
        BigInteger a = new BigInteger(sc.nextLine());
14
        BigInteger b = new BigInteger(sc.nextLine());
15
         BigInteger sum = a.add(b);
16
          BigInteger prod = a.multiply(b);
17
        
18
        System.out.println(sum+"\n"+prod);

    }

}



