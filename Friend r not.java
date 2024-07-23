import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        int n1=t.nextInt();
        int n2=t.nextInt();
        int s1=0,s2=0;
        for(int i=1;i<=n1;i++)
        {
            if(n1%i==0){
                s1+=i;
            }
        }
        int tot1=s1/n1;
        for(int i=1;i<=n2;i++)
        {
            if(n2%i==0)
            {
                s2+=i;
            }
        }
        int tot2=s2/n2;
        if(tot1==tot2)
        {
            System.out.println("The Given Number "+n1+" and "+n2+" are Friendly Pairs.");
        }
        else
        {
            System.out.println("The Given Number "+n1+" and "+n2+" are Not Friendly Pairs.");
        }
    }
}
