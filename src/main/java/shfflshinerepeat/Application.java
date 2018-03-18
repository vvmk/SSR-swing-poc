package shfflshinerepeat;

import comm.IOHandler;
import drills.DrillInstructor;
import window.AppWindow;

import javax.swing.*;
import java.awt.*;

/**
 * filename:
 * project: shfflshinerepeat
 * author: https://github.com/vvmk
 * date: 3/6/18
 */
public class Application extends JFrame {

    private AppWindow window;
    private DrillInstructor drillInstructor;
    private IOHandler io;

    public Application() {
        EventQueue.invokeLater(() -> {
            window.setVisible(true);
            window = new AppWindow();
        });
        io = new IOHandler();
        drillInstructor = new DrillInstructor(io.getTestDrills());
    }

    public static void main(String[] args) {
        Application app = new Application();

    }
}
