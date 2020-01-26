public class Final extends Test 
{
    

    
    
    
    
    
    
    public Final(){
    
    super();
    //String desc;
    setDescription("FINAL EXAM");
    //desc = "Final EXAM";
    //System.out.println("A default Final has been created!");
    
    }
    
    public Final(int maxPoints, String description, int actualPoints){
        
    super(maxPoints, description, actualPoints);
    setMaxPoints(maxPoints);
    setDescription("This is a TEST worth " + maxPoints + " points.");
    //String desc = "This is a TEST worth " + maxPoints + " points.";
    setActualGrade(actualPoints);
    //System.out.println("A final exam has been created!");
        
    }
    
    public double reportFinalGrade(){
    
    double grade = getActualGrade();
    
    double GPA;
    
    if (grade >= 90)
    {
    GPA = 4.0;    
    }
    
    else if (grade >= 90)
    {
    GPA = 3.0;    
    }
    
    else if (grade >= 70)
    {
    GPA = 2.0;    
    }
    
    else if (grade >= 60)
    {
    GPA = 1.0;    
    }
    
    else
    {
    GPA = 0.0;    
    }
    
    
    
    return GPA;
    
    }
    
    
     public String toString() {
         
        String rtn = getDescription() + " Final Grade: " + reportFinalGrade() + "\n";
          
         
          
        return rtn;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}