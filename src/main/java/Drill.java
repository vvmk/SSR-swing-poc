import java.util.Timer;

/**
 * filename:
 * project: shfflshinerepeat
 * author: https://github.com/vvmk
 * date: 2/12/18
 */
public class Drill implements Runnable {
    private int time;
    private String title;

    public Drill(String title, int time) {
        this.title = title;
        this.time = time;
    }

    private void doTick(int timeLeft) {
        System.out.println(timeLeft);
    }

    @Override
    public void run() {
        System.out.println(title + " ticking...");
    }

    public int getTime() {
        return time;
    }

    public String getTitle() {
        return title;
    }
}
