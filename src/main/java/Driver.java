import java.util.Scanner;

/**
 * filename:
 * project: shfflshinerepeat
 * author: https://github.com/vvmk
 * date: 2/12/18
 */

public class Driver {
    public static void main(String[] args) {
        DrillQueue timers = new DrillQueue();

        Scanner in = new Scanner(System.in);

        System.out.println("How many timers?");
        Integer numberOfTimers = Integer.parseInt(in.nextLine());

        System.out.println("How much time before each drill (in seconds)?");
        Integer breakTime = Integer.parseInt(in.nextLine());

        // build the queue
        for (int i=0;i<numberOfTimers;i++) {
            System.out.println("~~~ Drill #" + i + " ~~~");

            System.out.print("  Title: ");
            String title = in.nextLine();

            System.out.println("  Time (in seconds): ");
            Integer timeMilis = Integer.parseInt(in.nextLine()) * 1000; //TODO: enforce a limit or change to Double

            timers.addTimer(new Drill(title, timeMilis));
        }

        timers.runDrills();
    }
}
