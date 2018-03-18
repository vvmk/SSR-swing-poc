package drills;

import java.util.List;

/**
 * filename:
 * project: shfflshinerepeat
 * author: https://github.com/vvmk
 * date: 2/12/18
 */
public class DrillInstructor {
    private static final int DEFAULT_START_TIME = 5;
    private DrillSuite drillSuite;
    private int breakTime;

    public DrillInstructor(List<Drill> drills, int breakTime) {
        drillSuite = new DrillSuite(drills, breakTime);
    }

    public DrillInstructor(List<Drill> drills) {
        this(drills, DEFAULT_START_TIME);
    }

    public void loadDrills(List<Drill> drills, int breakTime) {
        drillSuite.loadSuite(drills, breakTime);
    }

    public void setBreakTime(int breakTime) {
        this.breakTime = breakTime;
    }

    public void runDrills() {
        Thread t = new Thread(drillSuite);
        t.start();
    }
}
