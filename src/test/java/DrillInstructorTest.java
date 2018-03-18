import comm.IOHandler;
import drills.DrillInstructor;
import org.junit.Test;
import shfflshinerepeat.Application;

/**
 * filename:
 * project: shfflshinerepeat
 * author: https://github.com/vvmk
 * date: 2/13/18
 */
public class DrillInstructorTest {
    @Test
    public void poc() {
        IOHandler io = new IOHandler();
        DrillInstructor di = new DrillInstructor(io.getTestDrills());
        di.runDrills();
    }
}
