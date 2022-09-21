import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
    
    
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student( String firstName , String lastName, int id, int[] testScores) 
    {
        super( firstName , lastName, id );
        
        this.testScores = testScores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    public char calculate( )
    {
        char grade;
         int avg = 0;
        for( int i=0; i< testScores.length; i++ )
           {
                avg+=testScores[i];
           }
           avg = avg/ testScores.length;
        if( avg<=100 && avg>=90 )
            grade = 'O';
        else if( avg<=89 && avg>=80)
            grade = 'E';
        else if( avg<=79 && avg>=70)
            grade = 'A';
        else if( avg<=69 && avg>=55)
            grade = 'P';
        else if( avg<=54 && avg>=40)
            grade = 'D';
        else
            grade = 'T';
            
        return grade;
    } 
    // Write your method here
}

class Solution {