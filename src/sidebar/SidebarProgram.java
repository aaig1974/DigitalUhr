package sidebar;

import elements.*;

import javax.swing.*;
import java.awt.*;

public class SidebarProgram {
    JFrame sidebarJFrame = null;

    private final int SIDEBARWIDTH = 170;
    private final int SIDEBARHIEGHT = 600;

    private DigitalClock digitalClock;

    private ButtonPaneUrl buttonPaneUrl;
    private JLabel jLabelUrl;
    private TextFieldUrlOpener textFieldUrlOpener;

    private JLabel jLabelProg;
    private ButtonPanelProgramOpener buttonPanelProgramOpener;

    private ButtonProgramOpener buttonProgramOpener;

    private Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

    public SidebarProgram() {
        sidebarJFrame = new JFrame("Sidebar");
        sidebarJFrame.setResizable(false);

        sidebarJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sidebarJFrame.setSize(SIDEBARWIDTH, SIDEBARHIEGHT);
        digitalClock = new DigitalClock();
        buttonPaneUrl = new ButtonPaneUrl();
        jLabelUrl = new JLabel("Url eingeben");
        jLabelProg = new JLabel("Programme");
        textFieldUrlOpener = new TextFieldUrlOpener();
        buttonPanelProgramOpener = new ButtonPanelProgramOpener();
        buttonProgramOpener = new ButtonProgramOpener();
        setLayout();


        sidebarJFrame.setVisible(true);
    }

    private void setLayout(){
        sidebarJFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        sidebarJFrame.getContentPane().add(digitalClock.getTimeLabel());
        sidebarJFrame.getContentPane().add(buttonPaneUrl.getButtonUrlJPanel());
        sidebarJFrame.getContentPane().add(jLabelUrl);
        sidebarJFrame.getContentPane().add(textFieldUrlOpener.getjTextField());
        sidebarJFrame.getContentPane().add(buttonPanelProgramOpener.getjPanelProgramOpener());
        sidebarJFrame.getContentPane().add(jLabelProg);

        sidebarJFrame.getContentPane().add(buttonProgramOpener.getjButton());

    }
}
