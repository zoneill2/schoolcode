public class HW extends Test 
{
    

    
    
    
    
    
    
    public HW(){
    
    super();
    setDescription("HW");
    //System.out.println("A default HW has been created!");
    
    }
    
    public HW(int maxPoints, String description, int actualPoints){
        
    super(maxPoints, description, actualPoints);
    setMaxPoints(maxPoints);
    setDescription("This is a HW worth " + maxPoints + " points.");
    setActualGrade(actualPoints);
    //System.out.println("A HW exam has been created!");
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}