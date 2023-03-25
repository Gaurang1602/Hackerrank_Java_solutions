Question-
  
  
Given a string, , and two indices,  and , print a substring consisting of all characters in the inclusive range from  to . You'll find the String class' substring method helpful in completing this challenge.

Input Format

The first line contains a single string denoting .
The second line contains two space-separated integers denoting the respective values of  and .

Constraints

String  consists of English alphabetic letters (i.e., ) only.
Output Format

Print the substring in the inclusive range from  to .

Sample Input

Helloworld
3 7
Sample Output

lowo
Explanation

In the diagram below, the substring is highlighted in green:

substring.png

Language
Java 7
More
1234567891011121314151617
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
    }
}

Line: 17 Col: 1

Test against custom input
Blog



Solution-
  
  
