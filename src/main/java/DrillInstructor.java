import javax.swing.*;
import java.util.concurrent.ConcurrentLinkedQueue;


/**
 * filename:
 * project: shfflshinerepeat
 * author: https://github.com/vvmk
 * date: 2/12/18
 */
public class DrillInstructor {

    private static final int period = 1000;             // tick every second
    private static final int DEFAULT_BREAK_TIME = 5;    // default 5 seconds between drills
    private int breakTime;
    private int secondsLeft;
    private ConcurrentLinkedQueue<Drill> drills;

    public DrillInstructor() {
        this(DEFAULT_BREAK_TIME);
    }

    public DrillInstructor(int breakTime) {
        this.breakTime = breakTime;
        this.drills = new ConcurrentLinkedQueue<>();
    }

    public void enqueue(Drill drill) {
        drills.add(drill);
    }

    public void runDrills() {
        secondsLeft = 5;
        Timer startCountdown = new Timer(1000, e -> {
            System.out.println(5 - (e.getWhen() - System.currentTimeMillis()));
        });
        startCountdown.start();
    }
}
