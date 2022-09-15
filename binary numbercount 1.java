/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) 
	{
	    String str = "";
	    int n = 6;
	    while( n!=0 )
	    {
            str = str + Integer.toString( n%2 );
	        n = n/2;
	    }
	   
	   int count = 1 , max = -99999;
	   
	   for( int i =0; i<str.length()-1;i++ )
	   {
	    if( str.charAt(i) == '1' && str.charAt(i+1) == '1' ) {
	         count++;
	         max = Math.max( max , count );
	    }
	    else {
	       
	        count = 1;
	    }
	   }
	    System.out.println( max );
	    
	    

	}
}
