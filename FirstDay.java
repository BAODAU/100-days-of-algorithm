import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static long exponential(int a, int b) {
        
        if (b == 0)
            return 1;
        
        if (b == 1)
            return a;
        
        long holder = a;
        
        for (int i = 1; i < b; i++) {
            holder *= a;
        }
        return holder;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        
        long miles = 0;
        int j = 0;
        
        //first sort the array into descending order
        Arrays.sort(calories);
        for (int i = calories.length - 1; i > -1; i--) {
            miles += calories[i]*exponential(2, j);
            j++;
//            System.out.println(exponential(2,j));
        }
        
        System.out.println(miles);
    }
}
