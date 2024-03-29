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
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    

          Scanner sc = new Scanner(System.in);

        BigInteger a = new BigInteger(sc.nextLine());

        BigInteger b = new BigInteger(sc.nextLine());

         BigInteger sum = a.add(b);

          BigInteger prod = a.multiply(b);

        
        System.out.println(sum+"\n"+prod);

    }

}



