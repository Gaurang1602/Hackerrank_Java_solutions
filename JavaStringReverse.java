Question-
  
  
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes
  
  
  Solution-
  
  
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s1=br.readLine();
        String s2=s1;
        StringBuffer s=new StringBuffer(s1);
        s.reverse();
        s1=s.toString();
        if(s1.compareTo(s2)==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}



