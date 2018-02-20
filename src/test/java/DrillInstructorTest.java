import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: shfflshinerepeat
 * author: https://github.com/vvmk
 * date: 2/13/18
 */
public class DrillInstructorTest {
    private volatile DrillInstructor drillInstructor;
    @Before
    public void setup() {
        drillInstructor = new DrillInstructor(5);
    }

    @Test
    public void proofOfConcept() {
        drillInstructor.runDrills();
    }
}
