import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution {

    public static void main (String[] args) throws java.lang.Exception

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int counter = 0;
        char last = s.charAt(0);
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == last)
                counter++;
            else last = s.charAt(i);

        }

        System.out.println(counter);

    }

}