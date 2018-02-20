import javax.swing.*;

/**
 * filename:
 * project: shfflshinerepeat
 * author: https://github.com/vvmk
 * date: 2/12/18
 */

public class Drill {
    private int time;
    private String title;

    public Drill(String title, int time) {
        this.title = title;
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public String getTitle() {
        return title;
    }
}
