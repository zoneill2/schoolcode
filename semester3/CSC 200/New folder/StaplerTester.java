/*
 * Name:
 * Date:
 * Description:
 */

//***************************************
//DRIVER PROGRAM CODE MAY NOT BE MODIFIED
//HOWEVER, DO PASTE RUN OUTPUT AT BOTTOM.
//***************************************

public class StaplerTester
{
    public static void main(String args[])
    {
        //create stapler objects
        Stapler test1 = new Stapler();
        Stapler test2 = new Stapler(25, 100, true);
        Stapler test3 = new Stapler(test2);

        //initial status
        System.out.println("BEFORE CHANGES");
        printStatus(test1, "test1");
        printStatus(test2, "test2");
        printStatus(test3, "test3");
        System.out.println();

        //first set of actions
        test1.staple();
        test1.staple();
        test2.staple();
        test2.staple();
        test3.openStapler();
        test3.staple();
        test3.staple();

        //middle status
        System.out.println("FIRST CHANGES");
        printStatus(test1, "test1");
        printStatus(test2, "test2");
        printStatus(test3, "test3");
        System.out.println();
        System.out.println();

        //second set of actions
        test1.openStapler();
        test1.addStaples(5000);
        test1.staple();
        test1.staple();
        test2.addStaples(10);
        test2.openStapler();
        test2.staple();
        test2.staple();
        test3.addStaples(10);
        test3.closeStapler();
        test3.staple();
        test3.staple();

        //final status
        System.out.println("SECOND CHANGES");
        printStatus(test1, "test1");
        printStatus(test2, "test2");
        printStatus(test3, "test3");
        System.out.println();
        System.out.println();

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println();
        System.out.println();

        //done
        System.out.println("Done...");
    }

    //Prints Stapler Status.
    private static void printStatus(Stapler temp, String name)
    {
        System.out.print(name + " status:\t");
        System.out.print("staples = " + temp.numStaples() + "\t");
        System.out.print("capacity = " + temp.getCapacity() + "\t");
        System.out.print("closed = " + temp.isClosed());
        System.out.println();
    }

}

/*
PASTE RUN OUTPUT HERE:


*/