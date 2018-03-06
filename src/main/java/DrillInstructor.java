import javax.swing.*;
import java.util.concurrent.ConcurrentLinkedQueue;


/**
 * filename:
 * project: shfflshinerepeat
 * author: https://github.com/vvmk
 * date: 2/12/18
 */
public class DrillInstructor {
    private static final int period = 1000;             // tick every second
    private static final int DEFAULT_BREAK_TIME = 5;    // default 5 seconds between drills
    /**
     * Swing tests
     */
    private static JLabel titleLabel;
    private static JLabel tickLabel;
    private static JButton startButton;
    private static int secondsLeft;
    private int breakTime;
    private ConcurrentLinkedQueue<Drill> drills;

    public DrillInstructor() {
        this(DEFAULT_BREAK_TIME);
    }

    public DrillInstructor(int breakTime) {
        this.breakTime = breakTime;
        this.drills = new ConcurrentLinkedQueue<>();
    }

    public static void setupGUI() {
        JFrame frame = new JFrame("SSR"); //create jframe
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //define close method

        /** setup components */
        //tickLabel = new JLabel("");
        titleLabel = new JLabel("SHFFL Shine Repeat");
        //startButton = new JButton("Start");

        secondsLeft = 5;

//        /** tests */
//        Drill d = new Drill("Drill #1 Title", 5000);
//        Timer t = new Timer(d.getTime(), e -> {
//            if (secondsLeft > 0) {
//                titleLabel.setText(d.getTitle());
//                tickLabel.setText(String.format("%d", secondsLeft));
//            }
//            System.out.println(--secondsLeft);
//        });
//
//        /** set up start button action, probably */
//        startButton.addActionListener(e -> {
//            t.start();
//            System.out.println("button click");
//        });

        //frame.getContentPane().add(startButton);
        frame.getContentPane().add(titleLabel);
        //frame.getContentPane().add(tickLabel);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(DrillInstructor::setupGUI);
    }

    public void enqueue(Drill drill) {
        drills.add(drill);
    }

    public void runDrills() {
        secondsLeft = 5;
        Timer countdown = new Timer(period, e -> {
            System.out.println("ticking");
        });
    }
}
