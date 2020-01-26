import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        
        // Instantiate a scanner
        Scanner scanner = new Scanner(System.in);
        
        // Get "seed" from user
        int seed = scanner.nextInt();
        
        // Instantiate an RNG with the seed
        Random random = new Random(seed);
        
        // Create 3 tests (1 default, 2 real)
        Test test01 = new Test();
        Test test02 = new Test(100, "Unit 1", random.nextInt(101));
        Test test03 = new Test(100, "Unit 2", random.nextInt(101));
        
        
        // Create 3 finals (1 default, 2 real)
        Final finalExam01 = new Final();
        Final finalExam02 = new Final(100, "Final 1", random.nextInt(101));
        Final finalExam03 = new Final(100, "Final 2", random.nextInt(101));
        
        // Create 3 hoeworks (1 default, 2 real)
        HW hw01 = new HW();
        HW hw02 = new HW(100, "Assignment 1", random.nextInt(101));
        HW hw03 = new HW(100, "Assignment 2", random.nextInt(101));
        
        // Instantiate an ArrayList
        ArrayList<Assessment> assessments = new ArrayList<Assessment>();
        
        // Populate the ArrayList with all the assignments
        assessments.add(test01);
        assessments.add(test02);
        assessments.add(test03);
        assessments.add(finalExam01);
        assessments.add(finalExam02);
        assessments.add(finalExam03);
        assessments.add(hw01);
        assessments.add(hw02);
        assessments.add(hw03);
        
        // Iterate through the ArrayList and output each element
        // This is called a FOR-EACH loop. It's cool. It just iterates
        // through the ArrayList. The code below it accomplishes
        // the same thing. Maybe you learned something today!
        for (Assessment s: assessments) {
            System.out.println(s);
        }

/*        
        for (int i = 0; i < assessments.size(); i++) {
            System.out.println(assessments.get(i));        
        }
 */    
    }
}