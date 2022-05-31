import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HollowPyramid {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
            {
            for(int j=0; j<2*n;j++)
                {if(i==0){
                if(j%2==0)
                System.out.print("*");
                else 
                    System.out.print(" ");}
                 else{
                 if(j == i || j == (2*n -2) -i){
                     System.out.print("*");}
                     else 
                         System.out.print(" ");
            }
                 }
            System.out.println();
            }
        
    }
}