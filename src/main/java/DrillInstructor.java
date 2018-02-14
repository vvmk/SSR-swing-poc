import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * filename:
 * project: shfflshinerepeat
 * author: https://github.com/vvmk
 * date: 2/12/18
 */
public class DrillInstructor {

    private ConcurrentLinkedQueue<Drill> drillsQueue;
    private int breakTime;
    private int tick;
    private Timer stopWatch;
    private TimerTask doTick;

    private static final int period = 1000;             // tick every second
    private static final int DEFAULT_BREAK_TIME = 5;    // default 5 seconds between drills

    public DrillInstructor() {
       this(DEFAULT_BREAK_TIME);
    }

    public DrillInstructor(int breakTime) {
        this.breakTime = breakTime;
        drillsQueue = new ConcurrentLinkedQueue<>();
        stopWatch = new Timer();

        doTick = new TimerTask() {
            @Override
            public void run() {
                System.out.print("\033[H\033[2J"); // maybe this will clear the console, maybe not. :copypasta:
                System.out.println(watchTick());
            }
        };
    }

    public void enqueue(Drill drill) {
        if (drillsQueue.offer(drill));
    }

    public void runDrills() {
        int period = 1000; // feels bad
        tick = 5; // also feels bad

        //execute initial countdown
        stopWatch.scheduleAtFixedRate(doTick, 0, period);
        //execute drills..
            //execute this drill..
                //show the drill title
                //schedule the drill task
            //execute an intermission..
                //print 'intermission'
                //schedule the task
        //option to repeat with same drills
        //or quit
    }

    public final int watchTick() {
        if (tick == 1)
            stopWatch.cancel();
        return --tick;
    }
}
