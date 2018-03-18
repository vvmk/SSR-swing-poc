package comm;

import drills.Drill;

import java.util.Arrays;
import java.util.List;

/**
 * filename:
 * project: ShfflShineRepeat
 * author: https://github.com/vvmk
 * date: 3/18/18
 */
public class IOHandler {
    public List<Drill> getDrillsFromFile() {
        return null;
    }

    public List<Drill> getDrillsFromUser() {
        return null;
    }

    public List<Drill> getTestDrills() {
        Drill[] drills = {
                new Drill("Dash -> Wavedash", 12),
                new Drill("Wavedash across stage (max length)", 6),
                new Drill("Short-hop -> Laser", 3),
                new Drill("Short-hop -> Turn-around Laser", 3)
        };
        return Arrays.asList(drills);
    }
}
