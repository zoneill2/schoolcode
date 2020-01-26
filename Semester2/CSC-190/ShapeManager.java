import java.util.Scanner;
import java.util.ArrayList;
public class ShapeManager
{
    
    
    public static void main (String [] args)
    {
    
    Scanner in = new Scanner(System.in);   
        
    ArrayList<Circle> circles = new ArrayList<Circle>();
    ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();      
        
    int choice = 0;
    
        while (choice != 4)
        {
            
            System.out.println("Choose an option: ");    
            System.out.println("1. Create a Circle ");    
            System.out.println("2. Create a Rectangle ");     
            System.out.println("3. Display all shapes ");
            System.out.println("4. Quit "); 
                
            choice = in.nextInt();    
                
                if (choice == 1)
                {
                    circleComputer(circles, in);    
                }
                    
                else if (choice == 2)
                {
                    rectangleComputer(rectangles, in);
                }
                    
                else if (choice == 3)
                {
                    showCircles(circles); 
                    showRectangles(rectangles);
                }
                
                else
                {
                    System.out.println("GOODBYE!");    
                }
                
               
        }
        
    }
    
    
    public static void circleComputer(ArrayList<Circle> circles, Scanner in)
    {
        System.out.println("Enter your radius: ");
        double radius = in.nextDouble();
        circles.add(new Circle(radius));
    
    }
    
    
    public static void rectangleComputer(ArrayList<Rectangle> rectangles, Scanner in)
    {
        System.out.println("Enter your length: ");
        double length = in.nextDouble();
        System.out.println("Enter your width: ");
        double width = in.nextDouble();
        rectangles.add(new Rectangle(length, width));
    
    }
    
    public static void showCircles(ArrayList<Circle> circles) 
    {
        System.out.println("-----------------------");
        
        for (int i = 0; i < circles.size(); i++)
        {
            System.out.println("Circle " + (i+1) + ": ");
            circles.get(i).computeArea(); 
            circles.get(i).computeCircumference(); 
            circles.get(i).computeDiameter(); 
            System.out.println("-----------------------");
        }
      
        
    }
    
        public static void showRectangles(ArrayList<Rectangle> rectangles) 
    {
        
        for (int i = 0; i < rectangles.size(); i++)
        {
            System.out.println("Rectangle " + (i+1) + ": ");
            rectangles.get(i).computeArea(); 
            rectangles.get(i).computePerimeter(); 
            System.out.println("-----------------------");
        }
        
    }
    
    
    
    
    
    
    
    
    
    

    
    
}