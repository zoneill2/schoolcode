/*
 * Name: Zach Oneill
 * Date: 9/17/2019
 * Description: Stapler.java assignment
 */

public class Stapler
{

	//********Instance Variables********


	private int staples;		//how many staples in stapler
	private int capacity;		//how many staples it can hold
	private boolean closed;	//is stapler closed?


	//********Constructors********


	//Default constructor.
	//Set to: zero staples, capacity 250, closed.
	//Hint:  Write the default constructor here
   public Stapler() {
   this.staples = 0;
   this.capacity = 250;
   this.closed = true;
   }



	//Regular constructor.  Initialize instance variables with
	//provided values.  Assume user will use valid values for all.
	public Stapler(int staples, int capacity, boolean closed)
	{
   this.staples = staples;
   this.capacity = capacity;
   this.closed = closed;
	}

	//Copy constructor.  Initializes stapler with values provided
	//from another stapler.  Assume "temp" stapler has valid values.
	public Stapler(Stapler temp)
	{
   this.staples = temp.staples;
   this.capacity = temp.capacity;
   this.closed = temp.closed;
	}


	//********Mutator Methods (change values) ********

	//Close the stapler
	public void closeStapler()
	{
   closed = true;
	}

	//Open the stapler
	public void openStapler()
	{
   closed = false;
	}

	//Subtract a single staple.  The stapler can
	//staple only when already closed AND when it HAS STAPLES.
	//**Both** conditions **must** be true to staple.
	//HINT:  Requires one or more IF statements.
	public void staple()
	{
      if(closed == true && staples > 0) {
      staples = staples - 1;  
      //System.out.println("stapled"); 
      }
      else{
      //System.out.println("close stapler");
      }
   }

	//Increase staples up to the maximum capacity.
	//The stapler must already be OPEN to add staples.
	//HINT: Requires IF statement(s) to make sure stapler is already open
	//and to make sure you fill it up to, BUT NOT BEYOND capacity.
	public void addStaples(int moreStaples)
	{
      if(closed == false) {
      int num = moreStaples + staples;
         if(num > capacity) {
         num = capacity - staples;
         staples = staples + num; 
         ///System.out.println("staples added 1");  
         }
         
         else {
         staples = staples + moreStaples;
         //System.out.println("staples added 2");
         }
      
      }
      
      else {
      //System.out.println("no staples added");
      }
	}


	//********Accessor Methods (return values) ********

	//returns number of staples
	public int numStaples()
	{
   return staples;
	}

	//returns capacity of stapler
	public int getCapacity()
	{
   return capacity;
	}

	//returns open/closed status of stapler
	public boolean isClosed()
	{
   return closed;
	}

	//*********Other Methods*********************
	//returns a string representing this stapler -
	// The string says "This stapler has room for x staples"
	// where x is the capcity minus the current number of staples
	// Hint:  Override the toString() method here
   public String toString() {
   int num2 = this.capacity - this.staples;
   String string = "This stapler has room for " + num2 + " staples!";
   return string;
   }

}

/*
BEFORE CHANGES
 test1 status:	staples = 0	capacity = 250	closed = true
 test2 status:	staples = 25	capacity = 100	closed = true
 test3 status:	staples = 25	capacity = 100	closed = true
 
 FIRST CHANGES
 test1 status:	staples = 0	capacity = 250	closed = true
 test2 status:	staples = 23	capacity = 100	closed = true
 test3 status:	staples = 25	capacity = 100	closed = false
 
 
 SECOND CHANGES
 test1 status:	staples = 250	capacity = 250	closed = false
 test2 status:	staples = 23	capacity = 100	closed = false
 test3 status:	staples = 33	capacity = 100	closed = true
 
 
 This stapler has room for 0 staples!
 This stapler has room for 77 staples!
 This stapler has room for 67 staples!
 

*/