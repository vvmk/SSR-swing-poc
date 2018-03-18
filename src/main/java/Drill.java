import javax.swing.*;

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

    public int getTime() {
        return time;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void run() {
        //TODO: set title label to this drill's title
        while(time >= 0 && !Thread.currentThread().isInterrupted()) {
            //TODO: update timer tick label == time
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                time = 0;
            }
            time--;
        }
        //TODO: clean up UI
    }
}
