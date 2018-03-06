import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * filename:
 * project: shfflshinerepeat
 * author: https://github.com/vvmk
 * date: 3/6/18
 */
public class Application extends JFrame {
    public static final String fWINDOW_TITLE = "SHFFL->Shine->Repeat";

    public Application() {
        initUI(); // bad form writing UI init code in the constructor
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Application app = new Application(); // instantiate a new app
            app.setVisible(true); // set this jframe to visible
        });
    }

    private void initUI() {
        initMainWindow();
        initStartButton();
        initIcon();
    }

    /** In OSX, sets the minimized window icon. sweet! */
    private void initIcon() {
        ImageIcon icon = new ImageIcon("/Users/V/code/ShfflShineRepeat/src/main/resources/shine-stock-java-ico.png");
        setIconImage(icon.getImage());
    }

    private void initStartButton() {
        JButton startButton = new JButton("Start");
        startButton.addActionListener((ActionEvent event) -> System.out.println("start!"));
        createLayout(startButton);
    }

    private void initMainWindow() {
        setTitle(fWINDOW_TITLE); // set the title
        setSize(300, 200); // set the size
        setLocationRelativeTo(null); // open relative to another component, in this case nothing. its the top level container
        setDefaultCloseOperation(EXIT_ON_CLOSE); // close button does nothing by default
    }

    private void createLayout(JComponent... arg) {
        Container pane = getContentPane();
        GroupLayout g1 = new GroupLayout(pane);
        pane.setLayout(g1);

        g1.setAutoCreateContainerGaps(true);

        g1.setHorizontalGroup(g1.createSequentialGroup()
                .addComponent(arg[0])
        );

        g1.setVerticalGroup(g1.createParallelGroup()
                .addComponent(arg[0])
        );
    }
}
