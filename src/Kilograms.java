/*
 WEEK 7 HOMEWORK ASSIGNMENT
 TARESSA HALPIN 
 KILOGRAMS TO POUNDS 
 CONVERSION TABLE  
  
  */


public class Kilograms {
    //PUBLIC STATIC MAIN METHOD
	public static void main(String[] args) {
	//DECLARED INTEGER I 
	int i; 
	//FINDAL DOUBLE VALUE POUND NUMBER 
	final double poundNumber = 2.2;
	//PRINT F STATEMENT: TABLE HEADERS POSITIONED 
	//FOR FOUR COLUMNS 
	System.out.printf("%-10s %8s    |   %-8s %10s%n",
			"KILOGRAMS",
			"POUNDS",
			"POUNDS",
			"KILOGRAMS");
	//INT POUNDS SET TO 20
	int pounds = 20; 
	//FOR LOOP 
	for (int i1 = 1; i1 < 200; i1 +=2)
	{   
		//PRINT F STATEMENT FOR CONVERSION VALUES 
		System.out.printf("%-10d %8.1f    |   %-8d %10.2f%n",
				//INTEGER VALUE 
				i1, 
				//INTEGER MULTIPLIED TO 2.2
		        i1 * 2.2, 
		        //POUNDS VALUE
		        pounds, 
		        //POUNDS MULTIPLIED TO 0.4545
		        pounds * 0.4545);
		        //POUNDS ADDED TO 5 
		        pounds += 5; 
		
	}
		
	   	
	
	
	
	}
		
}
