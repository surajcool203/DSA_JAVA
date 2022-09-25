import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum=0;
        int divisor;
        for(int i=1;i<=n;i++)
        {   
            if(n%i==0)
                {
                    divisor = n/i;
                    sum += divisor;
                }
        }
        return sum;
    }   
}

class Solution {
