import java.util.*;
public class Main
{   
    public static void main(String[] args) {
    		int n=-1;
    		if(n<2 && n>-2)
             System.out.print("not prime");
             
            if(n==2 || n==3 )
                System.out.print("prime");
                        
        for(int i=2;i*i<n;i++){
            if(n%i==0)
                System.out.print("notprime");
            else {
                System.out.print("prime");
            }
        }

	}
}
