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

  
  HackerRank Home
HackerRank
|
Prepare
Certify
Compete
Search
|
Switch to..
PrepareJavaBigNumberJava BigInteger
Java BigInteger
92 more points to get your gold badge!
Rank: 273229|Points: 158/250
Java
Problem
Submissions
Leaderboard
Discussions
Editorial
You made this submission 6 months ago.
Score:10.00Status:Accepted
People who solved Java BigInteger attempted this next:

Java BigDecimal
Learn to handle huge decimals using Java's BigDecimal class.
Submitted Code
Language: Java 7
Open in editor
1
import java.io.*;
2
import java.util.*;
3
import java.text.*;
4
import java.math.*;
5
import java.util.regex.*;
6
​
7
public class Solution {
8
​
9
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
19
    }
20
}
21
        
22
    
23
​

Test case 0

Test case 1

Test case 2

Test case 3

Test case 4

Test case 5

Test case 6

Test case 7

Test case 8
Compiler Message
Success
Input (stdin)
1234
20
Expected Output
1254
24680
NEED HELP?
View discussions
View editorial
View top submissions
BlogScoringEnvironmentFAQAbout UsSupportCareersTerms Of ServicePrivacy Policy
