import java.util.Scanner;

/**
 * filename:
 * project: shfflshinerepeat
 * author: https://github.com/vvmk
 * date: 2/12/18
 */

public class Driver {
    public static void main(String[] args) {
        DrillInstructor drillQueue = new DrillInstructor();

        Scanner in = new Scanner(System.in);

        System.out.println("How many drills?");
        Integer numberOfTimers = Integer.parseInt(in.nextLine());

        System.out.println("How much time before each drill (in seconds)?");
        Integer breakTime = Integer.parseInt(in.nextLine());

        // build the queue
        for (int i=0;i<numberOfTimers;i++) {
            System.out.println("Drill #" + (i+1));

            System.out.print("Title: ");
            String title = in.nextLine();

            System.out.print("Seconds: ");
            Integer timeSeconds = Integer.parseInt(in.nextLine()); //TODO: enforce a limit or change to Double

            drillQueue.enqueue(new Drill(title, timeSeconds));
        }

        drillQueue.runDrills();
    }
}
