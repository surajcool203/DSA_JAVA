public class MyClass {
        public static int  noOfJumps(int n)
        {
            //base case
            if( n == 0 )
            return 1;
            
            if(n<0)
                return 0;
            
            return noOfJumps(n-1) + noOfJumps(n-2) + noOfJumps(n-3);
        }
    
    
    public static void main(String args[]) {
      int n = 4;
      System.out.print(noOfJumps(n));    
    }
}