import java.util.*;

public class Main
{
    public static boolean isArmstrong(int a)
    {
        int temp=a;
        int res=0;
        int remainder=0;
        int power=0;
        
        while(temp>0)
        {
            temp = temp/10;
            power++;
        }
        temp =a;
        while(temp!=0)
        {
            remainder = temp%10;
            res += (Math.pow(remainder, power));
            temp/=10;
        }
        if(res==a)
            return true;
            
        else return false;    
    }
    
    
	public static void main(String[] args) {
		int a = 143;
		System.out.print( isArmstrong(a));
	}
}
