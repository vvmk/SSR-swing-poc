import java.util.concurrent.*;

/**
 * filename:
 * project: shfflshinerepeat
 * author: https://github.com/vvmk
 * date: 2/12/18
 */
public class DrillInstructor {

    private ConcurrentLinkedQueue<Drill> drillsQueue;
    private int breakTime;
    private int tick;
    private ScheduledExecutorService stopWatch;
    private Runnable countDown;

    private static final int period = 1000;             // tick every second
    private static final int DEFAULT_BREAK_TIME = 5;    // default 5 seconds between drills

    public DrillInstructor() {
       this(DEFAULT_BREAK_TIME);
    }

    public DrillInstructor(int breakTime) {
        this.breakTime = breakTime;
        drillsQueue = new ConcurrentLinkedQueue<>();

        stopWatch = Executors.newScheduledThreadPool(1);

        countDown = new Runnable() {
            public void run() {
                backspace(tick+1);
                System.out.println(tick);
            }
        };
    }

    public void enqueue(Drill drill) {
        if (drillsQueue.offer(drill)) {
            //successful add
        }
    }

    /**
     * experimenting, please excuse the mess
     */
    public void runDrills() {
        tick = 5; // also feels bad

        ScheduledFuture<?> countdownHandle = stopWatch.scheduleAtFixedRate(countDown, 1, 1 , TimeUnit.SECONDS);
        stopWatch.scheduleAtFixedRate(countDown, 1, 1, TimeUnit.SECONDS);
        stopWatch.schedule(new Runnable() {
                               public void run() {
                                   countdownHandle.cancel(true);
                               }
                           }, tick, TimeUnit.SECONDS);

        //execute drills..
            //execute this drill..
                //show the drill title
                //schedule the drill task
            //execute an intermission..
                //print 'intermission'
                //schedule the task
        //option to repeat with same drills
        //or quit
    }

    private static void backspace(int target) {
        StringBuilder sb = new StringBuilder();
        int numberOfBackspaces = sb.append(target).length();
        for (int i=0;i<numberOfBackspaces;i++)
            sb.append("\b");
        System.out.println(sb.toString());
    }
}
