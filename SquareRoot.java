//LCM of 2 Numbers
import java.util.*;

class Main{
    static int sqrt(int a)
    {    int i=0;
        if(a==0 || a==1)
            return a;
        else
        {
            while((i*i)<=a)
                i++;
        }
        return i-1;
        
    }
    
    
    public static void main(String[] args){
        int a = 18748173;
        System.out.println(sqrt(a));
    }
}

