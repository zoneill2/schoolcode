public class Test implements Assessment
{
    
    private String description;
    private int maxPoints;
    private int actualGrade;
    
    
    public String getDescription(){
        return description;
    }
    
      public void setDescription(String description){
        this.description = description;
    }
    
      public int getMaxPoints(){
        return maxPoints;
    }
    
       public void setMaxPoints(int maxPoints){
        this.maxPoints = maxPoints;
    }
    
      public void setActualGrade(int actualGrade){
        this.actualGrade = actualGrade;
    }
    
       public double getActualGrade(){
        return actualGrade;
    }
    
    
    
    
    
    public Test() {
        description = "TEST";
        maxPoints = 0;
        actualGrade = 0;
        //System.out.println("A default test was created!");
    }
    
    public Test (int maxPoints, String description, int actualGrade) {
        this.maxPoints = maxPoints;
        this.description = description;
        this.actualGrade = actualGrade;
        //System.out.println("A test was created!");
    }
    
    
     public String toString() {
        String rtn = description + "\n" +
           + actualGrade + "/" + maxPoints + "\n";
         
          
        return rtn;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}