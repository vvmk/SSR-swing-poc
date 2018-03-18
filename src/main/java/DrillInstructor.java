import java.util.List;

/**
 * filename:
 * project: shfflshinerepeat
 * author: https://github.com/vvmk
 * date: 2/12/18
 */
public class DrillInstructor {
    private List<Drill> drillSuite;
    private int breakTime;

    public DrillInstructor(List<Drill> drills, int breakTime) {
        drillSuite = drills;
        this.breakTime = breakTime;
    }

    public void loadDrills(List<Drill> drills) {
        drillSuite = drills;
    }

    public void setBreakTime(int breakTime) {
        this.breakTime = breakTime;
    }


}
