public class MyClass 
{
    public static int Factorial(int n, int p)
    {
        //base 
        if(p==0)
        {
            return 1;    
        }
        else
            return n * Factorial(n,p-1);
    }
   
   public static void main(String[] args){
     int n = 2;
     int p = 5;
     System.out.print(Factorial(n,p));
   } 
}