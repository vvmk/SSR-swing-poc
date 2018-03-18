package drills;

import java.util.List;

/**
 * filename:
 * project: ShfflShineRepeat
 * author: https://github.com/vvmk
 * date: 3/18/18
 */
public class DrillSuite implements Runnable {
    private List<Drill> suite;
    private int breakTime;

    public DrillSuite(List<Drill> suite, int breakTime) {
        this.suite = suite;
        this.breakTime = breakTime;
    }

    public void loadSuite(List<Drill> suite, int breakTime) {
        this.suite = suite;
        this.breakTime = breakTime;
    }

    private void runTimer(int seconds, String title) {
        //TODO: set title label to this drill's title
        System.out.println(title);
        while (seconds >= 0 && !Thread.currentThread().isInterrupted()) {
            //TODO: update timer tick label == time
            System.out.println(seconds);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                seconds = 0;
            }
            seconds--;
        }
    }

    @Override
    public void run() {
        for (Drill drill : suite) {
            runTimer(drill.getTime(), drill.getTitle());
        }
    }
}
