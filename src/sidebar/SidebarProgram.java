package sidebar;

import javax.swing.*;
import java.awt.*;

public class SidebarProgram {
    JFrame sidebarJFrame = null;

    private final int SIDEBARWIDTH = 150;
    private final int SIDEBARHIEGHT = 600;

    private DigitalClock digitalClock;

    private Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

    public SidebarProgram() {
        sidebarJFrame = new JFrame("Sidebar");
        sidebarJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sidebarJFrame.setSize(SIDEBARWIDTH, SIDEBARHIEGHT);
        digitalClock = new DigitalClock();
        setLayout();


        sidebarJFrame.setVisible(true);
    }

    private void setLayout(){
        sidebarJFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        sidebarJFrame.add(digitalClock.getTimeLabel());

    }
}
