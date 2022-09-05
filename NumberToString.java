public class MyClass 
{
    public static void printSpell(int n, String[] strArray)
    {
        if(n == 0)
        {
            return ;
        }
        
       printSpell(n/10, strArray);
       System.out.print( strArray[n%10] + " " ); 
          
         
        
    }
    
    public static void main(String args[])
    {
        int n = 432;
        String strArray[]= {"Zero","one","two","three","four","five","six","seven","eight","nine","ten"};
        
        // MyClass obj = new MyClass();
        printSpell(n,strArray);
      
    }
}