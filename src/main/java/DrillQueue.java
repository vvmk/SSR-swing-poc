import java.util.Queue;

/**
 * filename:
 * project: shfflshinerepeat
 * author: https://github.com/vvmk
 * date: 2/12/18
 */
public class DrillQueue implements Runnable {

    private Queue<Drill> drills;
    private int numberOfTimers;
    private int breakTime; // time before each drill timer for setup, reset, rest, etc.

    private static final int DEFAULT_BREAK_TIME = 5000; // default 5 seconds between drills

    public DrillQueue() {
       this(DEFAULT_BREAK_TIME);
    }

    public DrillQueue(int breakTime) {
        this.breakTime = breakTime;
    }

    public void addTimer(Drill drill) {
        if (drills.add(drill))
            numberOfTimers++;
    }

    public void setBreakTime(int breakTime) {
        this.breakTime = breakTime;
    }

    public int getNumberOfTimers() {
        return numberOfTimers;
    }

    public void runDrills() {
        //
    }

    @Override
    public void run() {
        //called on timer pop
    }
}
